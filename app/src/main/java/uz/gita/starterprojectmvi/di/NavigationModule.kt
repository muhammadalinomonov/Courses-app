package uz.gita.starterprojectmvi.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.starterprojectmvi.utils.navigation.AppNavigator
import uz.gita.starterprojectmvi.utils.navigation.NavigationDispatcher
import uz.gita.starterprojectmvi.utils.navigation.NavigationHandler

@Module
@InstallIn(SingletonComponent::class)
interface NavigationModule {

    @Binds
    fun bindAppNavigator(impl: NavigationDispatcher): AppNavigator

    @Binds
    fun bindNavigationHandler(impl: NavigationDispatcher): NavigationHandler
}


