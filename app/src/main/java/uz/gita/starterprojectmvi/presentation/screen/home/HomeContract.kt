package uz.gita.starterprojectmvi.presentation.screen.home

import org.orbitmvi.orbit.ContainerHost

interface HomeContract {
    sealed interface Model:ContainerHost<UiState, SideEffect>{
        fun getUserName():String
        fun eventDispatcher(intent:Intent)
    }
    sealed interface UiState{
        object Loading:UiState
        object Error:UiState
        object TabCourses:UiState
        object TabProfile:UiState
        object TabSettins:UiState

    }
    sealed interface SideEffect{
        data class ShowToast(val message:String):SideEffect

    }
    sealed interface Intent{
        object SlideCourses:Intent
        object SlideProfile:Intent
        object SlideSettins:Intent
    }
}