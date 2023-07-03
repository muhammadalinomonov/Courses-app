package uz.gita.starterprojectmvi.presentation.screen.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/HomeViewModel;", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$Model;", "Landroidx/lifecycle/ViewModel;", "preferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "container", "Lorg/orbitmvi/orbit/Container;", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$UiState;", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$SideEffect;", "getContainer", "()Lorg/orbitmvi/orbit/Container;", "eventDispatcher", "", "intent", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$Intent;", "getUserName", "", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel implements uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.Model {
    private final android.content.SharedPreferences preferences = null;
    @org.jetbrains.annotations.NotNull
    private final org.orbitmvi.orbit.Container<uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.UiState, uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.SideEffect> container = null;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences preferences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getUserName() {
        return null;
    }
    
    @java.lang.Override
    public void eventDispatcher(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.Intent intent) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.orbitmvi.orbit.Container<uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.UiState, uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.SideEffect> getContainer() {
        return null;
    }
}