package uz.gita.starterprojectmvi.presentation.screen.yourcourses

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import uz.gita.starterprojectmvi.domain.repository.AppRepository
import javax.inject.Inject


@SuppressLint("LogNotTimber")
@HiltViewModel
class YourCoursesViewModel @Inject constructor(
    private val direction: YourCoursesDirection,
    private val repository: AppRepository,
) : ViewModel(), YourCoursesContract.ViewModel {

    init {
        viewModelScope.launch {
            repository.getMyCourses().onEach { result ->
                uiState.update { it.copy(list = result) }
            }.launchIn(viewModelScope)
        }
    }

    override val uiState = MutableStateFlow(YourCoursesContract.UiState())
    override fun onEvenDispatcher(intent: YourCoursesContract.Intent) {
        when (intent) {
            is YourCoursesContract.Intent.Back -> {
                viewModelScope.launch {
                    direction.back()
                }
            }

            is YourCoursesContract.Intent.DetailsScreen -> {
                viewModelScope.launch {
                    direction.detailsScreen(intent.course)
                }
            }
        }
    }

}