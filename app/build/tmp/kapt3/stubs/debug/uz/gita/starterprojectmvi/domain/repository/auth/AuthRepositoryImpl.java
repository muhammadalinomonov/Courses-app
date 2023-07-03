package uz.gita.starterprojectmvi.domain.repository.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J/\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00120\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00f8\u0001\u0000J\u001f\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00120\u00112\u0006\u0010\u000f\u001a\u00020\u000eH\u0017\u00f8\u0001\u0000J\'\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00120\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016\u00f8\u0001\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Luz/gita/starterprojectmvi/domain/repository/auth/AuthRepositoryImpl;", "Luz/gita/starterprojectmvi/domain/repository/auth/AuthRepository;", "pref", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "store", "Lcom/google/firebase/firestore/FirebaseFirestore;", "addUserToStore", "", "name", "", "email", "createUser", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "password", "getUserName", "loginUser", "app_debug"})
public final class AuthRepositoryImpl implements uz.gita.starterprojectmvi.domain.repository.auth.AuthRepository {
    private final android.content.SharedPreferences pref = null;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    private final com.google.firebase.firestore.FirebaseFirestore store = null;
    
    @javax.inject.Inject
    public AuthRepositoryImpl(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences pref) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<kotlin.Unit>> loginUser(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<kotlin.Unit>> createUser(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @android.annotation.SuppressLint(value = {"CommitPrefEdits"})
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.lang.String>> getUserName(@org.jetbrains.annotations.NotNull
    java.lang.String email) {
        return null;
    }
    
    private final void addUserToStore(java.lang.String name, java.lang.String email) {
    }
}