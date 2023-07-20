package uz.gita.starterprojectmvi.presentation.screen.payment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.postSideEffect
import org.orbitmvi.orbit.syntax.simple.reduce
import org.orbitmvi.orbit.viewmodel.container
import uz.gita.starterprojectmvi.data.local.entity.CourseEntity
import uz.gita.starterprojectmvi.domain.repository.AppRepository
import javax.inject.Inject

@HiltViewModel
class PaymentModel @Inject constructor(
    private val repository: AppRepository,
    private val direction: PaymentContract.PaymentDirection
) : PaymentContract.Model, ViewModel() {
    override val container =
        container<PaymentContract.UiState, PaymentContract.SideEffect>(PaymentContract.UiState.Loading)

    var list = arrayListOf<CourseEntity>()

    override fun eventDispatcher(intent: PaymentContract.Intent) {
        when (intent) {
            PaymentContract.Intent.LoadList -> {
                viewModelScope.launch {
                    repository.getNotPurchasedCourse().onEach {
                        intent {
                            if (it.isNullOrEmpty()) {
                                reduce {
                                    PaymentContract.UiState.Empty
                                }
                            } else {
                                reduce {
                                    list.addAll(it)
                                    PaymentContract.UiState.GetList(it)
                                }
                            }
                        }
                    }.launchIn(viewModelScope)
                }
            }

            is PaymentContract.Intent.ClickPayButton -> {
                list.forEach {
                    it.isPurchased = true
                    repository.addCourse(it)
                }
                intent {
                    postSideEffect(PaymentContract.SideEffect.ShowMessage("To'landi..."))
                    reduce {
                        PaymentContract.UiState.Loading
                    }
                }
            }

            PaymentContract.Intent.Back -> {
                viewModelScope.launch {
                    direction.back()
                }
            }
        }
    }
}