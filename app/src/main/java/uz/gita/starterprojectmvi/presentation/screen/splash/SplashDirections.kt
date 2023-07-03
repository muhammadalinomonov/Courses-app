package uz.gita.starterprojectmvi.presentation.screen.splash

import uz.gita.starterprojectmvi.presentation.screen.auth.login.LoginScreen
import uz.gita.starterprojectmvi.presentation.screen.home.HomeScreen
import uz.gita.starterprojectmvi.presentation.screen.intro.IntroScreen
import uz.gita.starterprojectmvi.utils.navigation.AppNavigator
import javax.inject.Inject

class SplashDirections @Inject constructor(private val navigator: AppNavigator) {
    suspend fun openHomeScreen() {
        navigator.replace(HomeScreen())
    }

    suspend fun openIntroScreen() {
        navigator.replace(IntroScreen())
    }
}