package uz.gita.starterprojectmvi.presentation.screen.search;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/search/SearchViewModel;", "Luz/gita/starterprojectmvi/presentation/screen/search/SearchContract$ViewModel;", "Landroidx/lifecycle/ViewModel;", "directions", "Luz/gita/starterprojectmvi/presentation/screen/search/SearchContract$Directions;", "useCase", "Luz/gita/starterprojectmvi/domain/usecase/UseCase;", "(Luz/gita/starterprojectmvi/presentation/screen/search/SearchContract$Directions;Luz/gita/starterprojectmvi/domain/usecase/UseCase;)V", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Luz/gita/starterprojectmvi/presentation/screen/search/SearchContract$UiState;", "getUiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "eventDispatcher", "", "intent", "Luz/gita/starterprojectmvi/presentation/screen/search/SearchContract$Intent;", "app_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel implements uz.gita.starterprojectmvi.presentation.screen.search.SearchContract.ViewModel {
    private final uz.gita.starterprojectmvi.presentation.screen.search.SearchContract.Directions directions = null;
    private final uz.gita.starterprojectmvi.domain.usecase.UseCase useCase = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<uz.gita.starterprojectmvi.presentation.screen.search.SearchContract.UiState> uiState = null;
    
    @javax.inject.Inject
    public SearchViewModel(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.presentation.screen.search.SearchContract.Directions directions, @org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.domain.usecase.UseCase useCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.MutableStateFlow<uz.gita.starterprojectmvi.presentation.screen.search.SearchContract.UiState> getUiState() {
        return null;
    }
    
    @java.lang.Override
    public void eventDispatcher(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.presentation.screen.search.SearchContract.Intent intent) {
    }
}