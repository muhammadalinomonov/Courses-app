package uz.gita.starterprojectmvi.presentation.screen.home.page2

import android.annotation.SuppressLint
import android.content.SharedPreferences
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import org.orbitmvi.orbit.viewmodel.container
import uz.gita.starterprojectmvi.domain.usecase.UseCase
import javax.inject.Inject

@HiltViewModel
class Page2ViewModel @Inject constructor(
    private val useCase: UseCase,
    private val direction: Page2Direction,
    private val pref: SharedPreferences
) : Page2Contract.Model, ViewModel() {
    @SuppressLint("CommitPrefEdits")
    override fun eventDispatcher(intent: Page2Contract.Intent) {
        when (intent) {
            Page2Contract.Intent.LogOut -> {
                pref.edit().clear().apply()
                viewModelScope.launch {
                    direction.backToHome()
                }
            }
            Page2Contract.Intent.OpenMyCoursesScreen -> {
                viewModelScope.launch {
                    direction.openYourScreen()
                }
            }
        }
    }

    override val container =
        container<Page2Contract.UiState, Page2Contract.SideEffect>(Page2Contract.UiState.Loading)
}