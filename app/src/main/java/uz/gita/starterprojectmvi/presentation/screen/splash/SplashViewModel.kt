package uz.gita.starterprojectmvi.presentation.screen.splash

import android.content.SharedPreferences
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val sharedPref: SharedPreferences,
    private val directions: SplashDirections
) : ViewModel() {

    init {
        openNextScreen()
    }

    private fun openNextScreen() {
        viewModelScope.launch {
            delay(1500)
            if (sharedPref.getBoolean("HAS_USER", false)) {
                directions.openHomeScreen()
            } else {
                directions.openIntroScreen()
            }
        }
    }
}