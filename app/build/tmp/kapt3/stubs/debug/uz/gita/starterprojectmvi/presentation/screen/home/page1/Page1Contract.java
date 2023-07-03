package uz.gita.starterprojectmvi.presentation.screen.home.page1;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract;", "", "Intent", "Model", "Page1Direction", "SideEffect", "UiState", "app_debug"})
public abstract interface Page1Contract {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&R\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\f\u00a8\u0006\r"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$Model;", "Lorg/orbitmvi/orbit/ContainerHost;", "Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$UiState;", "Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$SideEffect;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "eventDispatcher", "", "intent", "Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$Intent;", "Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1ViewModel;", "app_debug"})
    public static abstract interface Model extends org.orbitmvi.orbit.ContainerHost<uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.UiState, uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.SideEffect> {
        
        @org.jetbrains.annotations.NotNull
        public abstract kotlinx.coroutines.flow.StateFlow<uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.UiState> getUiState();
        
        public abstract void eventDispatcher(@org.jetbrains.annotations.NotNull
        uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.Intent intent);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J3\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0006H\u00d6\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$UiState;", "", "courses", "", "Luz/gita/starterprojectmvi/data/model/CategoryData;", "categories", "", "name", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getCategories", "()Ljava/util/List;", "getCourses", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class UiState {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<uz.gita.starterprojectmvi.data.model.CategoryData> courses = null;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.String> categories = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        
        @org.jetbrains.annotations.NotNull
        public final uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.UiState copy(@org.jetbrains.annotations.NotNull
        java.util.List<uz.gita.starterprojectmvi.data.model.CategoryData> courses, @org.jetbrains.annotations.NotNull
        java.util.List<java.lang.String> categories, @org.jetbrains.annotations.NotNull
        java.lang.String name) {
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
        java.util.List<uz.gita.starterprojectmvi.data.model.CategoryData> courses, @org.jetbrains.annotations.NotNull
        java.util.List<java.lang.String> categories, @org.jetbrains.annotations.NotNull
        java.lang.String name) {
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
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> getCategories() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getName() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$SideEffect;", "", "ShowToast", "Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$SideEffect$ShowToast;", "app_debug"})
    public static abstract interface SideEffect {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$SideEffect$ShowToast;", "Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$SideEffect;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class ShowToast implements uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.SideEffect {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String message = null;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.SideEffect.ShowToast copy(@org.jetbrains.annotations.NotNull
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
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b\u00a8\u0006\f"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$Intent;", "", "Load", "OpenDetailsScreen", "OpenSearchScreen", "Search", "SelectCategories", "Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$Intent$Load;", "Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$Intent$OpenDetailsScreen;", "Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$Intent$OpenSearchScreen;", "Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$Intent$Search;", "Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$Intent$SelectCategories;", "app_debug"})
    public static abstract interface Intent {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$Intent$Load;", "Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$Intent;", "()V", "app_debug"})
        public static final class Load implements uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.Intent.Load INSTANCE = null;
            
            private Load() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$Intent$Search;", "Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$Intent;", "search", "", "(Ljava/lang/String;)V", "getSearch", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class Search implements uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.Intent {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String search = null;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.Intent.Search copy(@org.jetbrains.annotations.NotNull
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
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0004H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$Intent$SelectCategories;", "Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$Intent;", "list", "", "", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class SelectCategories implements uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.Intent {
            @org.jetbrains.annotations.NotNull
            private final java.util.List<java.lang.String> list = null;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.Intent.SelectCategories copy(@org.jetbrains.annotations.NotNull
            java.util.List<java.lang.String> list) {
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
            
            public SelectCategories(@org.jetbrains.annotations.NotNull
            java.util.List<java.lang.String> list) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<java.lang.String> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<java.lang.String> getList() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$Intent$OpenDetailsScreen;", "Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$Intent;", "coursesData", "Luz/gita/starterprojectmvi/data/model/CourseData;", "(Luz/gita/starterprojectmvi/data/model/CourseData;)V", "getCoursesData", "()Luz/gita/starterprojectmvi/data/model/CourseData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class OpenDetailsScreen implements uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.Intent {
            @org.jetbrains.annotations.NotNull
            private final uz.gita.starterprojectmvi.data.model.CourseData coursesData = null;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.Intent.OpenDetailsScreen copy(@org.jetbrains.annotations.NotNull
            uz.gita.starterprojectmvi.data.model.CourseData coursesData) {
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
            uz.gita.starterprojectmvi.data.model.CourseData coursesData) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.starterprojectmvi.data.model.CourseData component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.starterprojectmvi.data.model.CourseData getCoursesData() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$Intent$OpenSearchScreen;", "Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$Intent;", "()V", "app_debug"})
        public static final class OpenSearchScreen implements uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract.Intent.OpenSearchScreen INSTANCE = null;
            
            private OpenSearchScreen() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/home/page1/Page1Contract$Page1Direction;", "", "openDetailsScreen", "", "courseData", "Luz/gita/starterprojectmvi/data/model/CourseData;", "(Luz/gita/starterprojectmvi/data/model/CourseData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openSearchScreen", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static abstract interface Page1Direction {
        
        @org.jetbrains.annotations.Nullable
        public abstract java.lang.Object openDetailsScreen(@org.jetbrains.annotations.NotNull
        uz.gita.starterprojectmvi.data.model.CourseData courseData, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
        
        @org.jetbrains.annotations.Nullable
        public abstract java.lang.Object openSearchScreen(@org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    }
}