package uz.gita.starterprojectmvi.data.local;

import java.lang.System;

@androidx.room.Database(entities = {uz.gita.starterprojectmvi.data.local.entity.CourseEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Luz/gita/starterprojectmvi/data/local/MyDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getDao", "Luz/gita/starterprojectmvi/data/local/dao/MyDao;", "Companion", "app_debug"})
public abstract class MyDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final uz.gita.starterprojectmvi.data.local.MyDatabase.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DB_NAME = "database";
    
    public MyDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract uz.gita.starterprojectmvi.data.local.dao.MyDao getDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Luz/gita/starterprojectmvi/data/local/MyDatabase$Companion;", "", "()V", "DB_NAME", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}