package uz.gita.starterprojectmvi.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import uz.gita.starterprojectmvi.domain.usecase.UseCase
import uz.gita.starterprojectmvi.domain.usecase.UseCaseImpl
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
interface UseCaseModule {
    @Binds
    fun bindUseCase(impl: UseCaseImpl): UseCase
}