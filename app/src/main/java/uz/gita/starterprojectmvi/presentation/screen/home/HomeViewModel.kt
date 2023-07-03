package uz.gita.starterprojectmvi.presentation.screen.home

import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.reduce
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val preferences: SharedPreferences) :
    HomeContract.Model, ViewModel() {
    override fun getUserName(): String {
        Log.d("TTT", preferences.getString("USER_NAME", "Ghost").toString())
        return preferences.getString("USER_NAME", "Ghost").toString()
    }

    override fun eventDispatcher(intent: HomeContract.Intent) {
        when (intent) {
            HomeContract.Intent.SlideCourses -> {
                intent {
                    reduce {
                        HomeContract.UiState.TabCourses
                    }
                }

            }

            HomeContract.Intent.SlideProfile -> {
                intent {
                    reduce {
                        HomeContract.UiState.TabProfile
                    }
                }
            }

            HomeContract.Intent.SlideSettins -> {
                intent {
                    reduce {
                        HomeContract.UiState.TabSettins
                    }
                }
            }
        }
    }

    override val container =
        container<HomeContract.UiState, HomeContract.SideEffect>(HomeContract.UiState.Loading)
}