package uz.gita.starterprojectmvi.domain.repository

import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext
import uz.gita.starterprojectmvi.data.local.dao.MyDao
import uz.gita.starterprojectmvi.data.local.entity.CourseEntity
import uz.gita.starterprojectmvi.data.model.CategoryData
import uz.gita.starterprojectmvi.data.model.CourseData
import javax.inject.Inject

class AppRepositoryImpl @Inject constructor(private val dao: MyDao) : AppRepository {

    private val db = Firebase.firestore
    override suspend fun getAllCourses(): Result<List<CategoryData>> = withContext(Dispatchers.IO) {
        try {
            val a = db.collection("courses")
                .get()
                .await()

            val resultList = arrayListOf<CategoryData>()

            a.documents.forEach {
                val coursesList = arrayListOf<CourseData>()

                val subCollection = it.reference.collection("innner_courses")
                    .get()
                    .await()

                Log.d("SUB", subCollection.toString())

                subCollection.forEach { course ->
                    coursesList.add(
                        CourseData(
                            id = course.get("id") as Long,
                            name = course.get("name") as String,
                            description = course.get("description") as String,
                            duration = course.get("duration") as String,
                            imageUrl = course.get("imageUrl") as String,
                            price = course.get("price") as String,
                            title = course.get("title") as String,

                            )
                    )
                    /*Log.d("SUB", course.toObject(CourseData::class.java).toString())
                    coursesList.add(course.toObject(CourseData::class.java))*/
                }
                resultList.add(
                    CategoryData(
                        name = it.get("name") as String,
                        courses = coursesList
                    )
                )
            }
            return@withContext Result.success(resultList)
        } catch (e: Exception) {
            Log.d("ERROR", e.message!!)
            return@withContext Result.failure(e)
        }
    }

    override fun addCourse(courseEntity: CourseEntity) {
        dao.addCourse(courseEntity)
    }

    override fun getAllCoursesFromRoom(): Flow<List<CourseEntity>> {
        return dao.getAllCourses()
    }

    override suspend fun getMyCourses(): Flow<List<CourseEntity>> = dao.getAllCourses()


    override fun getNotPurchasedCourse(): Flow<List<CourseEntity>> {
        return dao.getNotPayedCourses()
    }
    /*override suspend fun getMyCourses(): Flow<Result<List<CourseData>>> = callbackFlow {
        val scope = CoroutineScope(Dispatchers.IO + SupervisorJob())
        dao.getAllCourses().onEach { list ->
            val res = ArrayList<CourseData>()
            list.forEach {
                res.add(it.entityToData())
            }
            trySend(Result.success(res))
        }.launchIn(scope)

        awaitClose()
    }*/

}