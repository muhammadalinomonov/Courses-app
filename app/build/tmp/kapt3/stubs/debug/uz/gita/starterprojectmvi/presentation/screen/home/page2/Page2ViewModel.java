package uz.gita.starterprojectmvi.presentation.screen.home.page2;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0017R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/page2/Page2ViewModel;", "Luz/gita/starterprojectmvi/presentation/screen/home/page2/Page2Contract$Model;", "Landroidx/lifecycle/ViewModel;", "useCase", "Luz/gita/starterprojectmvi/domain/usecase/UseCase;", "direction", "Luz/gita/starterprojectmvi/presentation/screen/home/page2/Page2Direction;", "pref", "Landroid/content/SharedPreferences;", "(Luz/gita/starterprojectmvi/domain/usecase/UseCase;Luz/gita/starterprojectmvi/presentation/screen/home/page2/Page2Direction;Landroid/content/SharedPreferences;)V", "container", "Lorg/orbitmvi/orbit/Container;", "Luz/gita/starterprojectmvi/presentation/screen/home/page2/Page2Contract$UiState;", "Luz/gita/starterprojectmvi/presentation/screen/home/page2/Page2Contract$SideEffect;", "getContainer", "()Lorg/orbitmvi/orbit/Container;", "eventDispatcher", "", "intent", "Luz/gita/starterprojectmvi/presentation/screen/home/page2/Page2Contract$Intent;", "app_debug"})
public final class Page2ViewModel extends androidx.lifecycle.ViewModel implements uz.gita.starterprojectmvi.presentation.screen.home.page2.Page2Contract.Model {
    private final uz.gita.starterprojectmvi.domain.usecase.UseCase useCase = null;
    private final uz.gita.starterprojectmvi.presentation.screen.home.page2.Page2Direction direction = null;
    private final android.content.SharedPreferences pref = null;
    @org.jetbrains.annotations.NotNull
    private final org.orbitmvi.orbit.Container<uz.gita.starterprojectmvi.presentation.screen.home.page2.Page2Contract.UiState, uz.gita.starterprojectmvi.presentation.screen.home.page2.Page2Contract.SideEffect> container = null;
    
    @javax.inject.Inject
    public Page2ViewModel(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.domain.usecase.UseCase useCase, @org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.presentation.screen.home.page2.Page2Direction direction, @org.jetbrains.annotations.NotNull
    android.content.SharedPreferences pref) {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"CommitPrefEdits"})
    @java.lang.Override
    public void eventDispatcher(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.presentation.screen.home.page2.Page2Contract.Intent intent) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.orbitmvi.orbit.Container<uz.gita.starterprojectmvi.presentation.screen.home.page2.Page2Contract.UiState, uz.gita.starterprojectmvi.presentation.screen.home.page2.Page2Contract.SideEffect> getContainer() {
        return null;
    }
}