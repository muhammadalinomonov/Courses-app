package uz.gita.starterprojectmvi.presentation.screen.intro

import uz.gita.starterprojectmvi.presentation.screen.auth.login.LoginScreen
import uz.gita.starterprojectmvi.utils.navigation.AppNavigator
import javax.inject.Inject

class IntroDirections @Inject constructor(private val navigator: AppNavigator) {
    suspend fun openLoginScreen() {

        navigator.replace(LoginScreen())
    }
}