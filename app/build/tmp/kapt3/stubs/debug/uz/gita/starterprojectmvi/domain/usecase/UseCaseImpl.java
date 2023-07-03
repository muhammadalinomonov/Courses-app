package uz.gita.starterprojectmvi.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0016J\u001d\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000b0\u000e0\nH\u0016\u00f8\u0001\u0000J3\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0\u000e0\n2\u0006\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH\u0016\u00f8\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Luz/gita/starterprojectmvi/domain/usecase/UseCaseImpl;", "Luz/gita/starterprojectmvi/domain/usecase/UseCase;", "repository", "Luz/gita/starterprojectmvi/domain/repository/AppRepository;", "(Luz/gita/starterprojectmvi/domain/repository/AppRepository;)V", "addCourse", "", "courseData", "Luz/gita/starterprojectmvi/data/model/CourseData;", "getAllCoursesFromRoom", "Lkotlinx/coroutines/flow/Flow;", "", "Luz/gita/starterprojectmvi/data/local/entity/CourseEntity;", "getCategories", "Lkotlin/Result;", "", "getCoursesByCategory", "Luz/gita/starterprojectmvi/data/model/CategoryData;", "name", "lit", "app_debug"})
public final class UseCaseImpl implements uz.gita.starterprojectmvi.domain.usecase.UseCase {
    private final uz.gita.starterprojectmvi.domain.repository.AppRepository repository = null;
    
    @javax.inject.Inject
    public UseCaseImpl(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.domain.repository.AppRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.starterprojectmvi.data.model.CategoryData>>> getCoursesByCategory(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> lit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<java.lang.String>>> getCategories() {
        return null;
    }
    
    @java.lang.Override
    public void addCourse(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.data.model.CourseData courseData) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.starterprojectmvi.data.local.entity.CourseEntity>> getAllCoursesFromRoom() {
        return null;
    }
}