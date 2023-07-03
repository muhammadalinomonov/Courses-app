package uz.gita.starterprojectmvi.domain.repository

import kotlinx.coroutines.flow.Flow
import uz.gita.starterprojectmvi.data.local.entity.CourseEntity
import uz.gita.starterprojectmvi.data.model.CategoryData
import uz.gita.starterprojectmvi.data.model.CourseData

interface AppRepository {
    suspend fun getAllCourses(): Result<List<CategoryData>>
    fun addCourse(courseData: CourseData)
    fun getAllCoursesFromRoom(): Flow<List<CourseEntity>>
    suspend fun getMyCourses(): Flow<List<CourseEntity>>
}