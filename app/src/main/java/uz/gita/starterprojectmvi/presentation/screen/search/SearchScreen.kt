package uz.gita.starterprojectmvi.presentation.screen.search

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.androidx.AndroidScreen
import cafe.adriel.voyager.hilt.getViewModel
import uz.gita.starterprojectmvi.R
import uz.gita.starterprojectmvi.ui.components.CourseItemInSearch

class SearchScreen : AndroidScreen() {
    @Composable
    override fun Content() {
        val viewModel: SearchContract.ViewModel = getViewModel<SearchViewModel>()
        val uiState = viewModel.uiState.collectAsState()

        SearchScreenContent(uiState, viewModel::eventDispatcher)
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    private fun SearchScreenContent(
        uiState: State<SearchContract.UiState>,
        onEventDispatcher: (SearchContract.Intent) -> Unit
    ) {

        var search by remember { mutableStateOf("") }

        Surface(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 8.dp)
                    .padding(top = 8.dp)
            ) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .height(56.dp)
                        .padding(top = 0.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = { onEventDispatcher(SearchContract.Intent.BackToHome) },
                        modifier = Modifier.size(50.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowDropDown,
                            contentDescription = null,
                            modifier = Modifier
                                .rotate(90f)
                                .size(50.dp)
                                .border(
                                    1.dp,
                                    shape = RoundedCornerShape(50.dp),
                                    color = Color.LightGray
                                )
                                .clip(RoundedCornerShape(50))

                        )
                    }


                    Spacer(modifier = Modifier.width(16.dp))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(0.dp)
                            .clip(CircleShape)


                    ) {
                        TextField(
                            modifier = Modifier
                                .fillMaxWidth(),
                            value = search,
                            onValueChange = {
                                search = it
                                onEventDispatcher(SearchContract.Intent.Search(search))
                            },
                            colors = TextFieldDefaults.textFieldColors(
                                textColor = Color.Black,
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent,
                                disabledIndicatorColor = Color.Transparent,
                                cursorColor = Color(0xFF050505)
                            ),
                            trailingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Search,
                                    contentDescription = "",
                                )
                            },
                            placeholder = { Text(text = "Search course", color = Color.Black) }
                        )
                    }
                }

                if (uiState.value.courses.isNotEmpty()) {
                    Log.d("SSS", uiState.value.courses.size.toString())
                    var count = 0
                    uiState.value.courses.forEach {
                        count += it.courses.size
                    }
                    Text(
                        text = "${count} result${
                            if (count == 1) ""
                            else "s"
                        }"
                    )
                    LazyColumn(modifier = Modifier.padding(top = 16.dp)) {
                        items(uiState.value.courses) { categoryData ->
                            categoryData.courses.forEach { courseData ->
                                CourseItemInSearch(
                                    courseData = courseData,
                                    onEventDispatcher = onEventDispatcher
                                )
                            }
                        }
                    }
                } else {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.no_course),
                            modifier = Modifier
                                .size(350.dp)
                                .padding(top = 100.dp),
                            contentDescription = null
                        )
                        Text(
                            text = "Course not found",
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            text = "Try searching the course with \n" +
                                    "a different keyword", textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
    }
}