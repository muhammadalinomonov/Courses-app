package uz.gita.starterprojectmvi.presentation.screen.home

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.hilt.getViewModel
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import org.orbitmvi.orbit.compose.collectAsState
import org.orbitmvi.orbit.compose.collectSideEffect
import uz.gita.starterprojectmvi.R
import uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Tab
import uz.gita.starterprojectmvi.presentation.screen.home.page2.Page2Tab
import uz.gita.starterprojectmvi.presentation.screen.home.page3.Page3Tab
import uz.gita.starterprojectmvi.ui.theme.MyColor1
import uz.gita.starterprojectmvi.utils.navigation.MyScreen

class HomeScreen : MyScreen() {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content() {
        val context = LocalContext.current
        val viewmodel = getViewModel<HomeViewModel>()
        val uiState = viewmodel.collectAsState().value

        TabNavigator(Page1Tab()) { tab ->
            Scaffold(
                content = {
                    Box(
                        Modifier
                            .fillMaxSize()
                            .padding(it)
                    ) {
                        CurrentTab()
                    }
                },
                bottomBar = {
                    NavigationBar {
                        TabNavigationItem(tab = Page1Tab()) {
                            viewmodel.eventDispatcher(HomeContract.Intent.SlideCourses)
                        }
                        TabNavigationItem(tab = Page2Tab()) {
                            viewmodel.eventDispatcher(HomeContract.Intent.SlideProfile)
                        }
                        TabNavigationItem(tab = Page3Tab()) {
                            viewmodel.eventDispatcher(HomeContract.Intent.SlideSettins)
                        }
                    }
                },

                /*{
                    NavigationBar(modifier = Modifier) {
                        TabNavigationItem(tab = Page1Tab())
                        TabNavigationItem(tab = Page2Tab())
                        TabNavigationItem(tab = Page3Tab())
                    }
                }*/
                topBar = {

                },
                /*content = { paddingValues ->
                    Box(
                        Modifier
                            .fillMaxSize()
                            .padding(paddingValues)
                    ) {
                        CurrentTab()
                    }

                }*/
            )
        }
        viewmodel.collectSideEffect { sideEffect ->
            when (sideEffect) {
                else -> {
                    Toast.makeText(context, "Fail....", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    @Composable
    fun RowScope.TabNavigationItem(
        tab: Tab,
        listener: () -> Unit
    ) {
        val tabNavigator = LocalTabNavigator.current

        NavigationBarItem(
            selected = tabNavigator.current == tab,
            onClick = {
                tabNavigator.current = tab;
                listener.invoke()
            },
            icon = {
                Icon(
                    painter = tab.options.icon!!,
                    contentDescription = tab.options.title,
                    modifier = Modifier.size(50.dp),
                    tint = if (tabNavigator.current == tab) MyColor1 else Color.Black
                )
            }
        )
    }

    /*@Composable
    private fun RowScope.TabNavigationItem(tab: Tab) {
        val tabNavigator = LocalTabNavigator.current

        NavigationBarItem(
            selected = tabNavigator.current == tab,
            onClick = { tabNavigator.current = tab },
            icon = { Icon(painter = tab.options.icon!!, contentDescription = tab.options.title) }
        )
    }*/
}