package com.sesimalam.mylapor.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {ModelDatabase.class}, version = 1, exportSchema = false)
public class AppDatabase extends RoomDatabase {
    public abstract LaporanDao laporanDao();
}
