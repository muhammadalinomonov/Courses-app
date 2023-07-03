package uz.gita.starterprojectmvi.presentation.screen.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u00a8\u0006\u0006"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/details/DetailsContract;", "", "Directions", "Intent", "UiState", "ViewModel", "app_debug"})
public abstract interface DetailsContract {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/details/DetailsContract$Intent;", "", "AddCourse", "BackToHome", "Check", "Luz/gita/starterprojectmvi/presentation/screen/details/DetailsContract$Intent$AddCourse;", "Luz/gita/starterprojectmvi/presentation/screen/details/DetailsContract$Intent$BackToHome;", "Luz/gita/starterprojectmvi/presentation/screen/details/DetailsContract$Intent$Check;", "app_debug"})
    public static abstract interface Intent {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/details/DetailsContract$Intent$Check;", "Luz/gita/starterprojectmvi/presentation/screen/details/DetailsContract$Intent;", "courseData", "Luz/gita/starterprojectmvi/data/model/CourseData;", "(Luz/gita/starterprojectmvi/data/model/CourseData;)V", "getCourseData", "()Luz/gita/starterprojectmvi/data/model/CourseData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Check implements uz.gita.starterprojectmvi.presentation.screen.details.DetailsContract.Intent {
            @org.jetbrains.annotations.NotNull
            private final uz.gita.starterprojectmvi.data.model.CourseData courseData = null;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.starterprojectmvi.presentation.screen.details.DetailsContract.Intent.Check copy(@org.jetbrains.annotations.NotNull
            uz.gita.starterprojectmvi.data.model.CourseData courseData) {
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
            
            public Check(@org.jetbrains.annotations.NotNull
            uz.gita.starterprojectmvi.data.model.CourseData courseData) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.starterprojectmvi.data.model.CourseData component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.starterprojectmvi.data.model.CourseData getCourseData() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/details/DetailsContract$Intent$AddCourse;", "Luz/gita/starterprojectmvi/presentation/screen/details/DetailsContract$Intent;", "courseData", "Luz/gita/starterprojectmvi/data/model/CourseData;", "(Luz/gita/starterprojectmvi/data/model/CourseData;)V", "getCourseData", "()Luz/gita/starterprojectmvi/data/model/CourseData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class AddCourse implements uz.gita.starterprojectmvi.presentation.screen.details.DetailsContract.Intent {
            @org.jetbrains.annotations.NotNull
            private final uz.gita.starterprojectmvi.data.model.CourseData courseData = null;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.starterprojectmvi.presentation.screen.details.DetailsContract.Intent.AddCourse copy(@org.jetbrains.annotations.NotNull
            uz.gita.starterprojectmvi.data.model.CourseData courseData) {
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
            
            public AddCourse(@org.jetbrains.annotations.NotNull
            uz.gita.starterprojectmvi.data.model.CourseData courseData) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.starterprojectmvi.data.model.CourseData component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.starterprojectmvi.data.model.CourseData getCourseData() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/details/DetailsContract$Intent$BackToHome;", "Luz/gita/starterprojectmvi/presentation/screen/details/DetailsContract$Intent;", "()V", "app_debug"})
        public static final class BackToHome implements uz.gita.starterprojectmvi.presentation.screen.details.DetailsContract.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.starterprojectmvi.presentation.screen.details.DetailsContract.Intent.BackToHome INSTANCE = null;
            
            private BackToHome() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\n\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\f\u001a\u00020\rH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000e"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/details/DetailsContract$UiState;", "", "isSaved", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class UiState {
        private final boolean isSaved = false;
        
        @org.jetbrains.annotations.NotNull
        public final uz.gita.starterprojectmvi.presentation.screen.details.DetailsContract.UiState copy(boolean isSaved) {
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
        
        public UiState() {
            super();
        }
        
        public UiState(boolean isSaved) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean isSaved() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/details/DetailsContract$ViewModel;", "", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "Luz/gita/starterprojectmvi/presentation/screen/details/DetailsContract$UiState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "onEventDispatcher", "", "intent", "Luz/gita/starterprojectmvi/presentation/screen/details/DetailsContract$Intent;", "app_debug"})
    public static abstract interface ViewModel {
        
        @org.jetbrains.annotations.NotNull
        public abstract kotlinx.coroutines.flow.StateFlow<uz.gita.starterprojectmvi.presentation.screen.details.DetailsContract.UiState> getUiState();
        
        public abstract void onEventDispatcher(@org.jetbrains.annotations.NotNull
        uz.gita.starterprojectmvi.presentation.screen.details.DetailsContract.Intent intent);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0005"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/details/DetailsContract$Directions;", "", "back", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static abstract interface Directions {
        
        @org.jetbrains.annotations.Nullable
        public abstract java.lang.Object back(@org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    }
}