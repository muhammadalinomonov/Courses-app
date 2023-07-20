package uz.gita.starterprojectmvi.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J(\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\u0012H\u0016J\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\u0012H\u0096@\u00f8\u0001\u0002\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Luz/gita/starterprojectmvi/domain/repository/AppRepositoryImpl;", "Luz/gita/starterprojectmvi/domain/repository/AppRepository;", "dao", "Luz/gita/starterprojectmvi/data/local/dao/MyDao;", "(Luz/gita/starterprojectmvi/data/local/dao/MyDao;)V", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "addCourse", "", "courseEntity", "Luz/gita/starterprojectmvi/data/local/entity/CourseEntity;", "getAllCourses", "Lkotlin/Result;", "", "Luz/gita/starterprojectmvi/data/model/CategoryData;", "getAllCourses-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllCoursesFromRoom", "Lkotlinx/coroutines/flow/Flow;", "getMyCourses", "getNotPurchasedCourse", "app_debug"})
public final class AppRepositoryImpl implements uz.gita.starterprojectmvi.domain.repository.AppRepository {
    private final uz.gita.starterprojectmvi.data.local.dao.MyDao dao = null;
    private final com.google.firebase.firestore.FirebaseFirestore db = null;
    
    @javax.inject.Inject
    public AppRepositoryImpl(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.data.local.dao.MyDao dao) {
        super();
    }
    
    @java.lang.Override
    public void addCourse(@org.jetbrains.annotations.NotNull
    uz.gita.starterprojectmvi.data.local.entity.CourseEntity courseEntity) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.starterprojectmvi.data.local.entity.CourseEntity>> getAllCoursesFromRoom() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getMyCourses(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<uz.gita.starterprojectmvi.data.local.entity.CourseEntity>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.starterprojectmvi.data.local.entity.CourseEntity>> getNotPurchasedCourse() {
        return null;
    }
}