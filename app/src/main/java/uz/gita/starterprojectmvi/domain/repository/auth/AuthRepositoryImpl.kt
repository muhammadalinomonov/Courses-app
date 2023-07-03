package uz.gita.starterprojectmvi.domain.repository.auth

import android.annotation.SuppressLint
import android.content.SharedPreferences
import android.util.Log
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val pref: SharedPreferences
) : AuthRepository {
    private val scope = CoroutineScope(Dispatchers.Main.immediate + SupervisorJob())
    private val auth = Firebase.auth
    private val store = Firebase.firestore

    override fun loginUser(email: String, password: String): Flow<Result<Unit>> = callbackFlow {
        auth.signInWithEmailAndPassword(email, password)
            .addOnSuccessListener {
                pref.edit().putBoolean("HAS_USER", true).apply()
                pref.edit().putString("EMAIL", email).apply()
                pref.edit().putString("PASSWORD", password).apply()





                trySend(Result.success(Unit))
            }
            .addOnFailureListener {
                pref.edit().putBoolean("hasUser", false).apply()
                trySend(Result.failure(Exception("Login yoki parolni xato kiritdingiz!!!")))
            }
            .addOnCanceledListener {
                pref.edit().putBoolean("hasUser", false).apply()
                trySend(Result.failure(Exception("XATOLIK!!!")))
            }
        awaitClose()
    }

    override fun createUser(email: String, password: String, name: String): Flow<Result<Unit>> =
        callbackFlow<Result<Unit>> {
            auth.createUserWithEmailAndPassword(email.trim(), password.trim())
                .addOnSuccessListener {
                    pref.edit().putBoolean("HAS_USER", true).apply()
                    pref.edit().putString("EMAIL", email.trim()).apply()
                    pref.edit().putString("PASSWORD", password.trim()).apply()
                    pref.edit().putString("USER_NAME", name).apply()
                    addUserToStore(name, email.trim())



                    trySend(Result.success(Unit))
                }
                .addOnFailureListener {
                    pref.edit().putBoolean("hasUser", false).apply()
                    trySend(Result.failure(Exception("Bu akkaunt oldindan mavjud!!!")))
                }
                .addOnCanceledListener {
                    pref.edit().putBoolean("hasUser", false).apply()
                    trySend(Result.failure(Exception("User yaratilmadi")))
                }
            awaitClose()
        }.flowOn(Dispatchers.IO)

    @SuppressLint("CommitPrefEdits")
    override fun getUserName(email: String): Flow<Result<String>> = callbackFlow {

        Log.d("LLL", "my email $email -> ${email.length}")
        store.collection("users")
            .document(email)
            .get()
            .addOnSuccessListener {
                Log.d("LLL", it.get("name") as String)
                pref.edit().putString("USER_NAME", it.get("name") as String).apply()

                trySend(Result.success(it.get("name") as String))
            }.addOnFailureListener {
                Log.d("LLL", it.message!!)
                trySend(Result.success("Guest"))
            }
        awaitClose()
    }.flowOn(Dispatchers.IO)

    private fun addUserToStore(name: String, email: String) {
        store.collection("users").document(email).set(hashMapOf("name" to name))
    }
}