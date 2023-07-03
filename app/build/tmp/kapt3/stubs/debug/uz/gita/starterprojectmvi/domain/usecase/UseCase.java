package uz.gita.starterprojectmvi.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H&J\u001d\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u000b0\u0007H&\u00f8\u0001\u0000J3\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\u000b0\u00072\u0006\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\bH&\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Luz/gita/starterprojectmvi/domain/usecase/UseCase;", "", "addCourse", "", "courseData", "Luz/gita/starterprojectmvi/data/model/CourseData;", "getAllCoursesFromRoom", "Lkotlinx/coroutines/flow/Flow;", "", "Luz/gita/starterprojectmvi/data/local/entity/CourseEntity;", "getCategories", "Lkotlin/Result;", "", "getCoursesByCategory", "Luz/gita/starterprojectmvi/data/model/CategoryData;", "name", "lit", "app_debug"})
public abstract interface UseCase {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.starterprojectmvi.data.model.CategoryData>>> getCoursesByCategory(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> lit);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<java.lang.String>>> getCategories();
    
    public abstract void addCourse(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.data.model.CourseData courseData);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.starterprojectmvi.data.local.entity.CourseEntity>> getAllCoursesFromRoom();
}