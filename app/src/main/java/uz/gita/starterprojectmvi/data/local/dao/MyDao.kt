package uz.gita.starterprojectmvi.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import uz.gita.starterprojectmvi.data.local.entity.CourseEntity

@Dao
interface MyDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addCourse(courseEntity: CourseEntity)


    @Query("SELECT * FROM courses WHERE isPurchased = 1")
    fun getAllCourses(): Flow<List<CourseEntity>>

    @Query("SELECT * FROM courses WHERE isPurchased = 0")
    fun getNotPayedCourses(): Flow<List<CourseEntity>>
}