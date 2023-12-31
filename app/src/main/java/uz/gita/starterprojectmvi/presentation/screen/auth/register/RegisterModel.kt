package uz.gita.starterprojectmvi.presentation.screen.auth.register

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
import uz.gita.starterprojectmvi.domain.repository.auth.AuthRepository
import javax.inject.Inject

@HiltViewModel
class RegisterModel @Inject constructor(
    private val authRepository: AuthRepository,
    private val direction: RegisterDirection
) : ViewModel(), RegisterContract.Model {
    override val container = container<RegisterContract.UiState, RegisterContract.SideEffect>(
        RegisterContract.UiState.Welcome
    )

    override fun eventDispatcher(intent: RegisterContract.Intent) {
        when (intent) {
            is RegisterContract.Intent.CreateUser -> {
                intent {
                    reduce {
                        RegisterContract.UiState.Loading
                    }
                }
                authRepository.createUser(intent.email, intent.password, intent.name).onEach {
                    it.onSuccess {
                        intent {
                            reduce {
                                RegisterContract.UiState.Welcome
                            }
                        }
                        direction.openHomeScreen()
                    }
                    it.onFailure {
                        intent {
                            postSideEffect(
                                RegisterContract.SideEffect.HasError(
                                    it.message ?: "Exception occured!"
                                )
                            )
                            reduce {
                                RegisterContract.UiState.Welcome
                            }
                        }
                    }
                }.launchIn(viewModelScope)
            }

            is RegisterContract.Intent.Back -> {
                viewModelScope.launch {
                    direction.popBackStack()
                }
            }

        }
    }
}