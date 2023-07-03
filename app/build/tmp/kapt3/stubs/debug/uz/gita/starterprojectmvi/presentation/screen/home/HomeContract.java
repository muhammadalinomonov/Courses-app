package uz.gita.starterprojectmvi.presentation.screen.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u00a8\u0006\u0006"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract;", "", "Intent", "Model", "SideEffect", "UiState", "app_debug"})
public abstract interface HomeContract {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&\u0082\u0001\u0001\n\u00a8\u0006\u000b"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$Model;", "Lorg/orbitmvi/orbit/ContainerHost;", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$UiState;", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$SideEffect;", "eventDispatcher", "", "intent", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$Intent;", "getUserName", "", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeViewModel;", "app_debug"})
    public static abstract interface Model extends org.orbitmvi.orbit.ContainerHost<uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.UiState, uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.SideEffect> {
        
        @org.jetbrains.annotations.NotNull
        public abstract java.lang.String getUserName();
        
        public abstract void eventDispatcher(@org.jetbrains.annotations.NotNull
        uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.Intent intent);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b\u00a8\u0006\f"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$UiState;", "", "Error", "Loading", "TabCourses", "TabProfile", "TabSettins", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$UiState$Error;", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$UiState$Loading;", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$UiState$TabCourses;", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$UiState$TabProfile;", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$UiState$TabSettins;", "app_debug"})
    public static abstract interface UiState {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$UiState$Loading;", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$UiState;", "()V", "app_debug"})
        public static final class Loading implements uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.UiState {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.UiState.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$UiState$Error;", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$UiState;", "()V", "app_debug"})
        public static final class Error implements uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.UiState {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.UiState.Error INSTANCE = null;
            
            private Error() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$UiState$TabCourses;", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$UiState;", "()V", "app_debug"})
        public static final class TabCourses implements uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.UiState {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.UiState.TabCourses INSTANCE = null;
            
            private TabCourses() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$UiState$TabProfile;", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$UiState;", "()V", "app_debug"})
        public static final class TabProfile implements uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.UiState {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.UiState.TabProfile INSTANCE = null;
            
            private TabProfile() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$UiState$TabSettins;", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$UiState;", "()V", "app_debug"})
        public static final class TabSettins implements uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.UiState {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.UiState.TabSettins INSTANCE = null;
            
            private TabSettins() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$SideEffect;", "", "ShowToast", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$SideEffect$ShowToast;", "app_debug"})
    public static abstract interface SideEffect {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$SideEffect$ShowToast;", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$SideEffect;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class ShowToast implements uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.SideEffect {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String message = null;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.SideEffect.ShowToast copy(@org.jetbrains.annotations.NotNull
            java.lang.String message) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public ShowToast(@org.jetbrains.annotations.NotNull
            java.lang.String message) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getMessage() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$Intent;", "", "SlideCourses", "SlideProfile", "SlideSettins", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$Intent$SlideCourses;", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$Intent$SlideProfile;", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$Intent$SlideSettins;", "app_debug"})
    public static abstract interface Intent {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$Intent$SlideCourses;", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$Intent;", "()V", "app_debug"})
        public static final class SlideCourses implements uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.Intent.SlideCourses INSTANCE = null;
            
            private SlideCourses() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$Intent$SlideProfile;", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$Intent;", "()V", "app_debug"})
        public static final class SlideProfile implements uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.Intent.SlideProfile INSTANCE = null;
            
            private SlideProfile() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$Intent$SlideSettins;", "Luz/gita/starterprojectmvi/presentation/screen/home/HomeContract$Intent;", "()V", "app_debug"})
        public static final class SlideSettins implements uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.starterprojectmvi.presentation.screen.home.HomeContract.Intent.SlideSettins INSTANCE = null;
            
            private SlideSettins() {
                super();
            }
        }
    }
}