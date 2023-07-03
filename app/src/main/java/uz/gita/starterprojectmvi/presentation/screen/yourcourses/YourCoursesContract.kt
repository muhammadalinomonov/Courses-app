package uz.gita.starterprojectmvi.presentation.screen.yourcourses

import kotlinx.coroutines.flow.StateFlow
import uz.gita.starterprojectmvi.data.local.entity.CourseEntity
import uz.gita.starterprojectmvi.data.model.CourseData


interface YourCoursesContract {


    data class UiState(
        val list: List<CourseEntity> = emptyList(),
    )

    sealed interface Intent {
        object Back : Intent
        class DetailsScreen(val course: CourseData) : Intent
    }

    interface ViewModel {
        val uiState: StateFlow<UiState>
        fun onEvenDispatcher(intent: Intent)
    }

}