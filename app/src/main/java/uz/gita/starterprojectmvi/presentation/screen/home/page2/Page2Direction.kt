package uz.gita.starterprojectmvi.presentation.screen.home.page2

import uz.gita.starterprojectmvi.presentation.screen.auth.login.LoginScreen
import uz.gita.starterprojectmvi.presentation.screen.payment.PaymentScreen
import uz.gita.starterprojectmvi.presentation.screen.yourcourses.YourCoursesScreen
import uz.gita.starterprojectmvi.utils.navigation.AppNavigator
import javax.inject.Inject

interface Page2Direction {
    suspend fun backToHome()
    suspend fun openPayments()
    suspend fun openYourScreen()
}

class Page2DirectionImpl @Inject constructor(
    private val appNavigator: AppNavigator
) : Page2Direction {
    override suspend fun backToHome() {
        appNavigator.replaceAll(LoginScreen())
    }

    override suspend fun openYourScreen() {
        appNavigator.navigateTo(YourCoursesScreen())
    }

    override suspend fun openPayments() {
        appNavigator.navigateTo(PaymentScreen())
    }

}