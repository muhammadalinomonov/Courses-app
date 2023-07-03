package uz.gita.starterprojectmvi.presentation.screen.auth.register;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract;", "", "Intent", "Model", "SideEffect", "SignUpDirection", "UiState", "app_debug"})
public abstract interface RegisterContract {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$Model;", "Lorg/orbitmvi/orbit/ContainerHost;", "Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$UiState;", "Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$SideEffect;", "eventDispatcher", "", "intent", "Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$Intent;", "app_debug"})
    public static abstract interface Model extends org.orbitmvi.orbit.ContainerHost<uz.gita.starterprojectmvi.presentation.screen.auth.register.RegisterContract.UiState, uz.gita.starterprojectmvi.presentation.screen.auth.register.RegisterContract.SideEffect> {
        
        public abstract void eventDispatcher(@org.jetbrains.annotations.NotNull
        uz.gita.starterprojectmvi.presentation.screen.auth.register.RegisterContract.Intent intent);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005\u00a8\u0006\u0006"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$UiState;", "", "Loading", "Welcome", "Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$UiState$Loading;", "Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$UiState$Welcome;", "app_debug"})
    public static abstract interface UiState {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$UiState$Welcome;", "Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$UiState;", "()V", "app_debug"})
        public static final class Welcome implements uz.gita.starterprojectmvi.presentation.screen.auth.register.RegisterContract.UiState {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.starterprojectmvi.presentation.screen.auth.register.RegisterContract.UiState.Welcome INSTANCE = null;
            
            private Welcome() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$UiState$Loading;", "Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$UiState;", "()V", "app_debug"})
        public static final class Loading implements uz.gita.starterprojectmvi.presentation.screen.auth.register.RegisterContract.UiState {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.starterprojectmvi.presentation.screen.auth.register.RegisterContract.UiState.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005\u00a8\u0006\u0006"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$Intent;", "", "Back", "CreateUser", "Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$Intent$Back;", "Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$Intent$CreateUser;", "app_debug"})
    public static abstract interface Intent {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0016"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$Intent$CreateUser;", "Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$Intent;", "email", "", "password", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getName", "getPassword", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class CreateUser implements uz.gita.starterprojectmvi.presentation.screen.auth.register.RegisterContract.Intent {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String email = null;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String password = null;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String name = null;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.starterprojectmvi.presentation.screen.auth.register.RegisterContract.Intent.CreateUser copy(@org.jetbrains.annotations.NotNull
            java.lang.String email, @org.jetbrains.annotations.NotNull
            java.lang.String password, @org.jetbrains.annotations.NotNull
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
            
            public CreateUser(@org.jetbrains.annotations.NotNull
            java.lang.String email, @org.jetbrains.annotations.NotNull
            java.lang.String password, @org.jetbrains.annotations.NotNull
            java.lang.String name) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getEmail() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getPassword() {
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
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$Intent$Back;", "Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$Intent;", "()V", "app_debug"})
        public static final class Back implements uz.gita.starterprojectmvi.presentation.screen.auth.register.RegisterContract.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.starterprojectmvi.presentation.screen.auth.register.RegisterContract.Intent.Back INSTANCE = null;
            
            private Back() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$SideEffect;", "", "HasError", "Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$SideEffect$HasError;", "app_debug"})
    public static abstract interface SideEffect {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$SideEffect$HasError;", "Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$SideEffect;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class HasError implements uz.gita.starterprojectmvi.presentation.screen.auth.register.RegisterContract.SideEffect {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String message = null;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.starterprojectmvi.presentation.screen.auth.register.RegisterContract.SideEffect.HasError copy(@org.jetbrains.annotations.NotNull
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
            
            public HasError(@org.jetbrains.annotations.NotNull
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
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0006"}, d2 = {"Luz/gita/starterprojectmvi/presentation/screen/auth/register/RegisterContract$SignUpDirection;", "", "openMainScreen", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "popBackStack", "app_debug"})
    public static abstract interface SignUpDirection {
        
        @org.jetbrains.annotations.Nullable
        public abstract java.lang.Object openMainScreen(@org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
        
        @org.jetbrains.annotations.Nullable
        public abstract java.lang.Object popBackStack(@org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    }
}