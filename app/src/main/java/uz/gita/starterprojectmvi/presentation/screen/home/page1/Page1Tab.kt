package uz.gita.starterprojectmvi.presentation.screen.home.page1

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.androidx.AndroidScreen
import cafe.adriel.voyager.hilt.getViewModel
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import org.orbitmvi.orbit.compose.collectSideEffect
import uz.gita.starterprojectmvi.R
import uz.gita.starterprojectmvi.presentation.screen.home.HomeScreen
import uz.gita.starterprojectmvi.ui.components.CourseItemInHome
import uz.gita.starterprojectmvi.ui.theme.MyColor1

class Page1Tab : Tab, AndroidScreen() {
    override val options: TabOptions
        @Composable
        get() {
            val title = "Courses"
            val icon = painterResource(id = R.drawable.nav_course)
            val selected = false

            return remember {
                TabOptions(
                    index = 1u,
                    title = title,
                    icon = icon
                )
            }
        }

    @Composable
    override fun Content() {
        val parentScreen = LocalNavigator.current?.parent?.lastItem // HomeScreen
        if (parentScreen !is HomeScreen) return
        val context = LocalContext.current
        val viewModel = getViewModel<Page1ViewModel>()

        viewModel.collectSideEffect { sideEffect ->
            when (sideEffect) {
                is Page1Contract.SideEffect.ShowToast -> {
                    Toast.makeText(context, sideEffect.message, Toast.LENGTH_SHORT).show()
                }
            }

        }
        val uiState = viewModel.uiState.collectAsState().value

        HomeScreenContent(uiState, viewModel::eventDispatcher)


    }

    @SuppressLint("MutableCollectionMutableState")
    @Composable
    private fun HomeScreenContent(
        uiState: Page1Contract.UiState,
        onEventDispatcher: (Page1Contract.Intent) -> Unit
    ) {

        val selectedCategories by remember {
            mutableStateOf(arrayListOf<String>())
        }


        Surface {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp)
            ) {

                Row(
                    Modifier
                        .fillMaxWidth()
                        .height(56.dp), horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(top = 4.dp), verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Hello,",
                            fontSize = MaterialTheme.typography.titleSmall.fontSize
                        )
                        Text(
                            text = uiState.name,
                            fontSize = MaterialTheme.typography.titleLarge.fontSize,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.ic_notif),
                        contentDescription = "Notification",
                        modifier = Modifier
                            .size(50.dp)
                            .padding(4.dp)
                    )


                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color.LightGray)
                        .clickable {
                            onEventDispatcher(Page1Contract.Intent.OpenSearchScreen)
                        },
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "Search course", modifier = Modifier.padding(start = 8.dp))

                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        modifier = Modifier.padding(end = 8.dp)
                    )
                }



                LazyColumn {
                    item {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {


                            LazyRow(
                                modifier = Modifier
                                    .padding(vertical = 16.dp)
                                    .height(50.dp)
                                    .align(Alignment.CenterVertically)
                            ) {
                                item {
                                    Text(
                                        text = "Categories:  ",
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically),
                                        textAlign = TextAlign.Center
                                    )

                                }
                                items(uiState.categories.size) {
                                    Button(
                                        onClick = {
                                            if (selectedCategories.contains(uiState.categories[it])) {
                                                selectedCategories.remove(uiState.categories[it])
                                            } else {
                                                selectedCategories.add(uiState.categories[it])
                                            }

                                            onEventDispatcher(
                                                Page1Contract.Intent.SelectCategories(
                                                    selectedCategories
                                                )
                                            )
                                        },
                                        modifier = Modifier.padding(horizontal = 8.dp),

                                        colors = if (selectedCategories.contains(uiState.categories[it])) {
                                            ButtonDefaults.buttonColors(Color.Blue)
                                        } else
                                            ButtonDefaults.buttonColors(Color(0xFF9E9B9B))
                                    ) {
                                        Text(text = uiState.categories[it])
                                    }
                                }
                            }
                        }

                    }
                    items(uiState.courses) { categoryData ->
                        Column {
                            categoryData.courses.forEach { courseData ->
                                CourseItemInHome(courseData, onEventDispatcher)
                            }
                        }
                    }
                }

                if (uiState.courses.isEmpty()) {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        CircularProgressIndicator(
                            modifier = Modifier.size(60.dp),
                            strokeWidth = 8.dp,
                            color = MyColor1
                        )
                    }
                }
            }
        }
    }


}