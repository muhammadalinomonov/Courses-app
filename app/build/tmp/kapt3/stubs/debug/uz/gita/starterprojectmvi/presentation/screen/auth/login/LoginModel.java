package uz.gita.starterprojectmvi.presentation.screen.auth.login;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/auth/login/LoginModel;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/starterprojectmvi/presentation/screen/auth/login/LoginContract$Model;", "preferences", "Landroid/content/SharedPreferences;", "direction", "Luz/gita/starterprojectmvi/presentation/screen/auth/login/LoginDirection;", "repository", "Luz/gita/starterprojectmvi/domain/repository/auth/AuthRepository;", "(Landroid/content/SharedPreferences;Luz/gita/starterprojectmvi/presentation/screen/auth/login/LoginDirection;Luz/gita/starterprojectmvi/domain/repository/auth/AuthRepository;)V", "container", "Lorg/orbitmvi/orbit/Container;", "Luz/gita/starterprojectmvi/presentation/screen/auth/login/LoginContract$UiState;", "Luz/gita/starterprojectmvi/presentation/screen/auth/login/LoginContract$SideEffect;", "getContainer", "()Lorg/orbitmvi/orbit/Container;", "eventDispatcher", "", "intent", "Luz/gita/starterprojectmvi/presentation/screen/auth/login/LoginContract$Intent;", "saveToPref", "it", "", "app_debug"})
public final class LoginModel extends androidx.lifecycle.ViewModel implements uz.gita.starterprojectmvi.presentation.screen.auth.login.LoginContract.Model {
    private final android.content.SharedPreferences preferences = null;
    private final uz.gita.starterprojectmvi.presentation.screen.auth.login.LoginDirection direction = null;
    private final uz.gita.starterprojectmvi.domain.repository.auth.AuthRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final org.orbitmvi.orbit.Container<uz.gita.starterprojectmvi.presentation.screen.auth.login.LoginContract.UiState, uz.gita.starterprojectmvi.presentation.screen.auth.login.LoginContract.SideEffect> container = null;
    
    @javax.inject.Inject
    public LoginModel(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences preferences, @org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.presentation.screen.auth.login.LoginDirection direction, @org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.domain.repository.auth.AuthRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.orbitmvi.orbit.Container<uz.gita.starterprojectmvi.presentation.screen.auth.login.LoginContract.UiState, uz.gita.starterprojectmvi.presentation.screen.auth.login.LoginContract.SideEffect> getContainer() {
        return null;
    }
    
    @java.lang.Override
    public void eventDispatcher(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.presentation.screen.auth.login.LoginContract.Intent intent) {
    }
    
    private final void saveToPref(java.lang.String it) {
    }
}