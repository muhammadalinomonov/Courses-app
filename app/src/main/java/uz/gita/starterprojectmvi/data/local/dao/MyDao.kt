package uz.gita.starterprojectmvi.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import uz.gita.starterprojectmvi.data.local.entity.CourseEntity

@Dao
interface MyDao {
    @Insert
    fun addCourse(courseEntity: CourseEntity)

    @Query("SELECT * FROM courses")
    fun getAllCourses(): Flow<List<CourseEntity>>
}