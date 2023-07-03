package uz.gita.starterprojectmvi.presentation.screen.home.page1;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1ViewModel;", "Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$Model;", "Landroidx/lifecycle/ViewModel;", "useCase", "Luz/gita/starterprojectmvi/domain/usecase/UseCase;", "pref", "Landroid/content/SharedPreferences;", "repository", "Luz/gita/starterprojectmvi/domain/repository/auth/AuthRepository;", "direction", "Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$Page1Direction;", "(Luz/gita/starterprojectmvi/domain/usecase/UseCase;Landroid/content/SharedPreferences;Luz/gita/starterprojectmvi/domain/repository/auth/AuthRepository;Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$Page1Direction;)V", "container", "Lorg/orbitmvi/orbit/Container;", "Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$UiState;", "Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$SideEffect;", "getContainer", "()Lorg/orbitmvi/orbit/Container;", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "eventDispatcher", "", "intent", "Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$Intent;", "app_debug"})
public final class Page1ViewModel extends androidx.lifecycle.ViewModel implements uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.Model {
    private final uz.gita.starterprojectmvi.domain.usecase.UseCase useCase = null;
    private final android.content.SharedPreferences pref = null;
    private final uz.gita.starterprojectmvi.domain.repository.auth.AuthRepository repository = null;
    private final uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.Page1Direction direction = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.UiState> uiState = null;
    @org.jetbrains.annotations.NotNull
    private final org.orbitmvi.orbit.Container<uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.UiState, uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.SideEffect> container = null;
    
    @javax.inject.Inject
    public Page1ViewModel(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.domain.usecase.UseCase useCase, @org.jetbrains.annotations.NotNull
    android.content.SharedPreferences pref, @org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.domain.repository.auth.AuthRepository repository, @org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.Page1Direction direction) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.MutableStateFlow<uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.UiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.orbitmvi.orbit.Container<uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.UiState, uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.SideEffect> getContainer() {
        return null;
    }
    
    @java.lang.Override
    public void eventDispatcher(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.Intent intent) {
    }
}