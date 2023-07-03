package uz.gita.starterprojectmvi.presentation.screen.auth.register;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterModel;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$Model;", "authRepository", "Luz/gita/starterprojectmvi/domain/repository/auth/AuthRepository;", "direction", "Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterDirection;", "(Luz/gita/starterprojectmvi/domain/repository/auth/AuthRepository;Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterDirection;)V", "container", "Lorg/orbitmvi/orbit/Container;", "Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$UiState;", "Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$SideEffect;", "getContainer", "()Lorg/orbitmvi/orbit/Container;", "eventDispatcher", "", "intent", "Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$Intent;", "app_debug"})
public final class RegisterModel extends androidx.lifecycle.ViewModel implements uz.gita.starterprojectmvi.presentation.screen.auth.register.RegisterContract.Model {
    private final uz.gita.starterprojectmvi.domain.repository.auth.AuthRepository authRepository = null;
    private final uz.gita.starterprojectmvi.presentation.screen.auth.register.RegisterDirection direction = null;
    @org.jetbrains.annotations.NotNull
    private final org.orbitmvi.orbit.Container<uz.gita.starterprojectmvi.presentation.screen.auth.register.RegisterContract.UiState, uz.gita.starterprojectmvi.presentation.screen.auth.register.RegisterContract.SideEffect> container = null;
    
    @javax.inject.Inject
    public RegisterModel(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.domain.repository.auth.AuthRepository authRepository, @org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.presentation.screen.auth.register.RegisterDirection direction) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.orbitmvi.orbit.Container<uz.gita.starterprojectmvi.presentation.screen.auth.register.RegisterContract.UiState, uz.gita.starterprojectmvi.presentation.screen.auth.register.RegisterContract.SideEffect> getContainer() {
        return null;
    }
    
    @java.lang.Override
    public void eventDispatcher(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.presentation.screen.auth.register.RegisterContract.Intent intent) {
    }
}