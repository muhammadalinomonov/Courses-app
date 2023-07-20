package uz.gita.starterprojectmvi.data.local.dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'\u00a8\u0006\n"}, d2 = {"Luz/gita/starterprojectmvi/data/local/dao/MyDao;", "", "addCourse", "", "courseEntity", "Luz/gita/starterprojectmvi/data/local/entity/CourseEntity;", "getAllCourses", "Lkotlinx/coroutines/flow/Flow;", "", "getNotPayedCourses", "app_debug"})
public abstract interface MyDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void addCourse(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.data.local.entity.CourseEntity courseEntity);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM courses WHERE isPurchased = 1")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.starterprojectmvi.data.local.entity.CourseEntity>> getAllCourses();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM courses WHERE isPurchased = 0")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.starterprojectmvi.data.local.entity.CourseEntity>> getNotPayedCourses();
}