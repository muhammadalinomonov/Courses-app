package uz.gita.starterprojectmvi.presentation.screen.auth.register

import uz.gita.starterprojectmvi.presentation.screen.home.HomeScreen
import uz.gita.starterprojectmvi.utils.navigation.AppNavigator
import javax.inject.Inject

interface RegisterDirection {
    suspend fun openHomeScreen()
    suspend fun popBackStack()
}

class RegisterDirectionImpl @Inject constructor(
    private val navigator: AppNavigator
) : RegisterDirection {
    override suspend fun openHomeScreen() {
        navigator.replaceAll(HomeScreen())
    }

    override suspend fun popBackStack() {
        navigator.back()
    }
}