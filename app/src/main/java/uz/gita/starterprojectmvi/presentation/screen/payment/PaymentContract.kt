package uz.gita.starterprojectmvi.presentation.screen.payment

import org.orbitmvi.orbit.ContainerHost
import uz.gita.starterprojectmvi.data.local.entity.CourseEntity

interface PaymentContract {
    sealed interface Model: ContainerHost<UiState, SideEffect> {
        fun eventDispatcher(intent:Intent)
    }
    sealed interface UiState{
        object Loading:UiState
        object Empty:UiState
        data class GetList(val list:List<CourseEntity>):UiState
    }
    sealed interface SideEffect{
        data class ShowMessage(val message:String):SideEffect
    }
    sealed interface Intent{
        data class ClickPayButton(val sum:Int):Intent
        object LoadList:Intent
        object Back:Intent
    }

    interface PaymentDirection {
        suspend fun back()
    }
}