package uz.gita.starterprojectmvi.presentation.screen.intro

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class IntroViewModel @Inject constructor(private val directions: IntroDirections) : ViewModel() {
    fun openLoginScreen() {
        viewModelScope.launch {
            directions.openLoginScreen()
        }
    }
}