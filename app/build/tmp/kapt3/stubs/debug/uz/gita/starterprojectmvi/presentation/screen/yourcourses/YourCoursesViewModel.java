package uz.gita.starterprojectmvi.presentation.screen.yourcourses;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@android.annotation.SuppressLint(value = {"LogNotTimber"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/yourcourses/YourCoursesViewModel;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/starterprojectmvi/presentation/screen/yourcourses/YourCoursesContract$ViewModel;", "direction", "Luz/gita/starterprojectmvi/presentation/screen/yourcourses/YourCoursesDirection;", "repository", "Luz/gita/starterprojectmvi/domain/repository/AppRepository;", "(Luz/gita/starterprojectmvi/presentation/screen/yourcourses/YourCoursesDirection;Luz/gita/starterprojectmvi/domain/repository/AppRepository;)V", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Luz/gita/starterprojectmvi/presentation/screen/yourcourses/YourCoursesContract$UiState;", "getUiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "onEvenDispatcher", "", "intent", "Luz/gita/starterprojectmvi/presentation/screen/yourcourses/YourCoursesContract$Intent;", "app_debug"})
public final class YourCoursesViewModel extends androidx.lifecycle.ViewModel implements uz.gita.starterprojectmvi.presentation.screen.yourcourses.YourCoursesContract.ViewModel {
    private final uz.gita.starterprojectmvi.presentation.screen.yourcourses.YourCoursesDirection direction = null;
    private final uz.gita.starterprojectmvi.domain.repository.AppRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<uz.gita.starterprojectmvi.presentation.screen.yourcourses.YourCoursesContract.UiState> uiState = null;
    
    @javax.inject.Inject
    public YourCoursesViewModel(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.presentation.screen.yourcourses.YourCoursesDirection direction, @org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.domain.repository.AppRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.MutableStateFlow<uz.gita.starterprojectmvi.presentation.screen.yourcourses.YourCoursesContract.UiState> getUiState() {
        return null;
    }
    
    @java.lang.Override
    public void onEvenDispatcher(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.presentation.screen.yourcourses.YourCoursesContract.Intent intent) {
    }
}