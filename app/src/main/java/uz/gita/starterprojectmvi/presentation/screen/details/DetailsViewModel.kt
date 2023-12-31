package uz.gita.starterprojectmvi.presentation.screen.details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import uz.gita.starterprojectmvi.domain.usecase.UseCase
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(
    private val directions: DetailsContract.Directions,
    private val useCase: UseCase
) : DetailsContract.ViewModel, ViewModel() {
    override val uiState = MutableStateFlow(DetailsContract.UiState())





    override fun onEventDispatcher(intent: DetailsContract.Intent) {
        when (intent) {
            is DetailsContract.Intent.AddCourse -> {
                useCase.addCourse(intent.courseData)
            }

            is DetailsContract.Intent.Check -> {
                useCase.getAllCoursesFromRoom().onEach {
                    var isHave = false
                    it.forEach { courseEntity ->
                        if (courseEntity.name == intent.courseData.name && courseEntity.title == intent.courseData.title) {
                            isHave = true
                            uiState.update { uiState ->
                                uiState.copy(isSaved = true)
                            }
                        }
                    }
                }.launchIn(viewModelScope)
            }

            DetailsContract.Intent.BackToHome -> {
                viewModelScope.launch {
                    directions.back()
                }
            }
        }
    }

}