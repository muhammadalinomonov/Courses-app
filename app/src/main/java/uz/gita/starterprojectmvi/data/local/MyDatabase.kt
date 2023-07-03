package uz.gita.starterprojectmvi.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import uz.gita.starterprojectmvi.data.local.dao.MyDao
import uz.gita.starterprojectmvi.data.local.entity.CourseEntity

@Database(entities = [CourseEntity::class], version = 1, exportSchema = false)
abstract class MyDatabase : RoomDatabase() {
    abstract fun getDao(): MyDao

    companion object {
        const val DB_NAME = "database"
    }
}