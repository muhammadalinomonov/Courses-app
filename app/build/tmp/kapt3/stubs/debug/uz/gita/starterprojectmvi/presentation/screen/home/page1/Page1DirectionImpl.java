package uz.gita.starterprojectmvi.presentation.screen.home.page1;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1DirectionImpl;", "Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$Page1Direction;", "appNavigator", "Luz/gita/starterprojectmvi/utils/navigation/AppNavigator;", "(Luz/gita/starterprojectmvi/utils/navigation/AppNavigator;)V", "openDetailsScreen", "", "courseData", "Luz/gita/starterprojectmvi/data/model/CourseData;", "(Luz/gita/starterprojectmvi/data/model/CourseData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openSearchScreen", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class Page1DirectionImpl implements uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.Page1Direction {
    private final uz.gita.starterprojectmvi.utils.navigation.AppNavigator appNavigator = null;
    
    @javax.inject.Inject
    public Page1DirectionImpl(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.utils.navigation.AppNavigator appNavigator) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object openDetailsScreen(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.data.model.CourseData courseData, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object openSearchScreen(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}