package uz.gita.starterprojectmvi.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Luz/gita/starterprojectmvi/di/UseCaseModule;", "", "bindUseCase", "Luz/gita/starterprojectmvi/domain/usecase/UseCase;", "impl", "Luz/gita/starterprojectmvi/domain/usecase/UseCaseImpl;", "app_debug"})
@dagger.Module
public abstract interface UseCaseModule {
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.starterprojectmvi.domain.usecase.UseCase bindUseCase(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.domain.usecase.UseCaseImpl impl);
}