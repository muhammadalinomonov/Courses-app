package uz.gita.starterprojectmvi.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0011H\'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0014H\'J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0017H\'J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u001aH\'J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u001dH\'\u00a8\u0006\u001e"}, d2 = {"Luz/gita/starterprojectmvi/di/DirectionModule;", "", "bindDetailsDirection", "Luz/gita/starterprojectmvi/presentation/screen/details/DetailsContract$Directions;", "impl", "Luz/gita/starterprojectmvi/presentation/screen/details/DetailsDirections;", "bindHomeDirection", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeDirection;", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeDirectionImpl;", "bindLoginDirection", "Luz/gita/starterprojectmvi/presentation/screen/auth/login/LoginDirection;", "Luz/gita/starterprojectmvi/presentation/screen/auth/login/LoginDirectionImpl;", "bindPage1Direction", "Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$Page1Direction;", "Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1DirectionImpl;", "bindPage2Direction", "Luz/gita/starterprojectmvi/presentation/screen/home/page2/Page2Direction;", "Luz/gita/starterprojectmvi/presentation/screen/home/page2/Page2DirectionImpl;", "bindPage3Direction", "Luz/gita/starterprojectmvi/presentation/screen/home/page3/Page3Direction;", "Luz/gita/starterprojectmvi/presentation/screen/home/page3/Page3DirectionImpl;", "bindRegisterDirection", "Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterDirection;", "Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterDirectionImpl;", "bindSearchDirection", "Luz/gita/starterprojectmvi/presentation/screen/search/SearchContract$Directions;", "Luz/gita/starterprojectmvi/presentation/screen/search/SearchDirectionsImpl;", "yourCoursesDirection", "Luz/gita/starterprojectmvi/presentation/screen/yourcourses/YourCoursesDirection;", "Luz/gita/starterprojectmvi/presentation/screen/yourcourses/YourCoursesDirectionImpl;", "app_debug"})
@dagger.Module
public abstract interface DirectionModule {
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.starterprojectmvi.presentation.screen.home.HomeDirection bindHomeDirection(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.presentation.screen.home.HomeDirectionImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.Page1Direction bindPage1Direction(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1DirectionImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.starterprojectmvi.presentation.screen.home.page2.Page2Direction bindPage2Direction(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.presentation.screen.home.page2.Page2DirectionImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.starterprojectmvi.presentation.screen.home.page3.Page3Direction bindPage3Direction(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.presentation.screen.home.page3.Page3DirectionImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.starterprojectmvi.presentation.screen.yourcourses.YourCoursesDirection yourCoursesDirection(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.presentation.screen.yourcourses.YourCoursesDirectionImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.starterprojectmvi.presentation.screen.auth.login.LoginDirection bindLoginDirection(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.presentation.screen.auth.login.LoginDirectionImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.starterprojectmvi.presentation.screen.auth.register.RegisterDirection bindRegisterDirection(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.presentation.screen.auth.register.RegisterDirectionImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.starterprojectmvi.presentation.screen.search.SearchContract.Directions bindSearchDirection(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.presentation.screen.search.SearchDirectionsImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.starterprojectmvi.presentation.screen.details.DetailsContract.Directions bindDetailsDirection(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.presentation.screen.details.DetailsDirections impl);
}