package uz.gita.starterprojectmvi.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J(\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\rH&J\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\rH\u00a6@\u00f8\u0001\u0002\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Luz/gita/starterprojectmvi/domain/repository/AppRepository;", "", "addCourse", "", "courseData", "Luz/gita/starterprojectmvi/data/model/CourseData;", "getAllCourses", "Lkotlin/Result;", "", "Luz/gita/starterprojectmvi/data/model/CategoryData;", "getAllCourses-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllCoursesFromRoom", "Lkotlinx/coroutines/flow/Flow;", "Luz/gita/starterprojectmvi/data/local/entity/CourseEntity;", "getMyCourses", "app_debug"})
public abstract interface AppRepository {
    
    public abstract void addCourse(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.data.model.CourseData courseData);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.starterprojectmvi.data.local.entity.CourseEntity>> getAllCoursesFromRoom();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMyCourses(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<uz.gita.starterprojectmvi.data.local.entity.CourseEntity>>> continuation);
}