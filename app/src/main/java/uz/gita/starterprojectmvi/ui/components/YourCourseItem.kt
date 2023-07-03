package uz.gita.starterprojectmvi.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import uz.gita.starterprojectmvi.R
import uz.gita.starterprojectmvi.data.local.entity.CourseEntity
import uz.gita.starterprojectmvi.presentation.screen.yourcourses.YourCoursesContract

@Composable
fun YourCourseItem(
    courseData: CourseEntity,
    onEventDispatcher: (YourCoursesContract.Intent) -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 0.dp, vertical = 4.dp)
            .height(350.dp)
            .border(1.dp, Color(0xFF858282), shape = RoundedCornerShape(8.dp))
            .clip(RoundedCornerShape(8.dp))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .clickable { onEventDispatcher(YourCoursesContract.Intent.DetailsScreen(courseData.entityToData())) }) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
            ) {
                AsyncImage(
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(0.dp)),
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(courseData.imageUrl)
                        .crossfade(true)
                        .build(),
                    placeholder = painterResource(id = R.drawable.html4),
                    error = painterResource(id = R.drawable.html),
                    contentDescription = null,
                    contentScale = ContentScale.Crop

                )


                Button(
                    onClick = { }, modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .padding(end = 4.dp)
                ) {
                    Text(text = courseData.price)
                }
            }

            Text(
                text = courseData.duration,
                color = Color.Green,
                modifier = Modifier.padding(horizontal = 4.dp)
            )
            Text(
                text = courseData.name,
                fontSize = 28.sp,
                color = Color.Black,
                modifier = Modifier.padding(horizontal = 4.dp)
            )
            Spacer(
                modifier = Modifier
                    .height(0.dp)
                    .weight(1f)
            )
            Text(
                text = courseData.title,
                fontSize = 15.sp,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 8.dp, start = 4.dp)
            )
        }
    }
}