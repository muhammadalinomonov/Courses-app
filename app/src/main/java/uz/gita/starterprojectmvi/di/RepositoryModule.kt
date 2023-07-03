package uz.gita.starterprojectmvi.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.starterprojectmvi.domain.repository.AppRepository
import uz.gita.starterprojectmvi.domain.repository.AppRepositoryImpl
import uz.gita.starterprojectmvi.domain.repository.auth.AuthRepository
import uz.gita.starterprojectmvi.domain.repository.auth.AuthRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @[Binds Singleton]
    fun bindAppRepository(impl: AppRepositoryImpl): AppRepository

    @[Binds Singleton]
    fun bindRepository(impl: AuthRepositoryImpl): AuthRepository
}