package uz.gita.starterprojectmvi.presentation.screen.payment

import uz.gita.starterprojectmvi.utils.navigation.AppNavigator
import javax.inject.Inject


class PaymentDirectionImpl @Inject constructor(
    private val navigator: AppNavigator
) : PaymentContract.PaymentDirection {
    override suspend fun back() {
        navigator.back()
    }

}