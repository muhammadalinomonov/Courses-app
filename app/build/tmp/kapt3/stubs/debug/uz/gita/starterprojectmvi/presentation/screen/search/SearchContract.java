package uz.gita.starterprojectmvi.presentation.screen.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u00a8\u0006\u0006"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/search/SearchContract;", "", "Directions", "Intent", "UiState", "ViewModel", "app_debug"})
public abstract interface SearchContract {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t\u00a8\u0006\n"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/search/SearchContract$Intent;", "", "BackToHome", "Load", "OpenDetailsScreen", "Search", "Luz/gita/starterprojectmvi/presentation/screen/search/SearchContract$Intent$BackToHome;", "Luz/gita/starterprojectmvi/presentation/screen/search/SearchContract$Intent$Load;", "Luz/gita/starterprojectmvi/presentation/screen/search/SearchContract$Intent$OpenDetailsScreen;", "Luz/gita/starterprojectmvi/presentation/screen/search/SearchContract$Intent$Search;", "app_debug"})
    public static abstract interface Intent {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/search/SearchContract$Intent$Load;", "Luz/gita/starterprojectmvi/presentation/screen/search/SearchContract$Intent;", "()V", "app_debug"})
        public static final class Load implements uz.gita.starterprojectmvi.presentation.screen.search.SearchContract.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.starterprojectmvi.presentation.screen.search.SearchContract.Intent.Load INSTANCE = null;
            
            private Load() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/search/SearchContract$Intent$Search;", "Luz/gita/starterprojectmvi/presentation/screen/search/SearchContract$Intent;", "search", "", "(Ljava/lang/String;)V", "getSearch", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class Search implements uz.gita.starterprojectmvi.presentation.screen.search.SearchContract.Intent {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String search = null;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.starterprojectmvi.presentation.screen.search.SearchContract.Intent.Search copy(@org.jetbrains.annotations.NotNull
            java.lang.String search) {
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
            
            public Search(@org.jetbrains.annotations.NotNull
            java.lang.String search) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getSearch() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/search/SearchContract$Intent$OpenDetailsScreen;", "Luz/gita/starterprojectmvi/presentation/screen/search/SearchContract$Intent;", "courseData", "Luz/gita/starterprojectmvi/data/model/CourseData;", "(Luz/gita/starterprojectmvi/data/model/CourseData;)V", "getCourseData", "()Luz/gita/starterprojectmvi/data/model/CourseData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class OpenDetailsScreen implements uz.gita.starterprojectmvi.presentation.screen.search.SearchContract.Intent {
            @org.jetbrains.annotations.NotNull
            private final uz.gita.starterprojectmvi.data.model.CourseData courseData = null;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.starterprojectmvi.presentation.screen.search.SearchContract.Intent.OpenDetailsScreen copy(@org.jetbrains.annotations.NotNull
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
            
            public OpenDetailsScreen(@org.jetbrains.annotations.NotNull
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
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/search/SearchContract$Intent$BackToHome;", "Luz/gita/starterprojectmvi/presentation/screen/search/SearchContract$Intent;", "()V", "app_debug"})
        public static final class BackToHome implements uz.gita.starterprojectmvi.presentation.screen.search.SearchContract.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.starterprojectmvi.presentation.screen.search.SearchContract.Intent.BackToHome INSTANCE = null;
            
            private BackToHome() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/search/SearchContract$UiState;", "", "courses", "", "Luz/gita/starterprojectmvi/data/model/CategoryData;", "(Ljava/util/List;)V", "getCourses", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class UiState {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<uz.gita.starterprojectmvi.data.model.CategoryData> courses = null;
        
        @org.jetbrains.annotations.NotNull
        public final uz.gita.starterprojectmvi.presentation.screen.search.SearchContract.UiState copy(@org.jetbrains.annotations.NotNull
        java.util.List<uz.gita.starterprojectmvi.data.model.CategoryData> courses) {
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
        
        public UiState(@org.jetbrains.annotations.NotNull
        java.util.List<uz.gita.starterprojectmvi.data.model.CategoryData> courses) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<uz.gita.starterprojectmvi.data.model.CategoryData> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<uz.gita.starterprojectmvi.data.model.CategoryData> getCourses() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/search/SearchContract$ViewModel;", "", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "Luz/gita/starterprojectmvi/presentation/screen/search/SearchContract$UiState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "eventDispatcher", "", "intent", "Luz/gita/starterprojectmvi/presentation/screen/search/SearchContract$Intent;", "app_debug"})
    public static abstract interface ViewModel {
        
        @org.jetbrains.annotations.NotNull
        public abstract kotlinx.coroutines.flow.StateFlow<uz.gita.starterprojectmvi.presentation.screen.search.SearchContract.UiState> getUiState();
        
        public abstract void eventDispatcher(@org.jetbrains.annotations.NotNull
        uz.gita.starterprojectmvi.presentation.screen.search.SearchContract.Intent intent);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/search/SearchContract$Directions;", "", "backToHome", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openDetailsScreen", "courseData", "Luz/gita/starterprojectmvi/data/model/CourseData;", "(Luz/gita/starterprojectmvi/data/model/CourseData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static abstract interface Directions {
        
        @org.jetbrains.annotations.Nullable
        public abstract java.lang.Object openDetailsScreen(@org.jetbrains.annotations.NotNull
        uz.gita.starterprojectmvi.data.model.CourseData courseData, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
        
        @org.jetbrains.annotations.Nullable
        public abstract java.lang.Object backToHome(@org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    }
}