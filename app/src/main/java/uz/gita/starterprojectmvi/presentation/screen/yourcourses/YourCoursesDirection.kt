package uz.gita.starterprojectmvi.presentation.screen.yourcourses

import uz.gita.starterprojectmvi.data.model.CourseData
import uz.gita.starterprojectmvi.presentation.screen.details.DetailsScreen
import uz.gita.starterprojectmvi.utils.navigation.AppNavigator
import javax.inject.Inject


interface YourCoursesDirection {

    suspend fun back()
    suspend fun detailsScreen(course: CourseData)

}

class YourCoursesDirectionImpl @Inject constructor(
    private val navigator: AppNavigator,
) : YourCoursesDirection {
    override suspend fun back() {
        navigator.back()
    }

    override suspend fun detailsScreen(course: CourseData) {
        navigator.navigateTo(DetailsScreen(course))
    }

}