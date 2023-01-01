package com.sesimalam.mylapor.room;


import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@androidx.room.Dao
public interface LaporanDao {

    @Query("SELECT * FROM tbl_laporan")
    LiveData<List<ModelDatabase>> getAllReport();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertData(ModelDatabase... modelDatabases);

    @Query("DELETE FROM tbl_laporan")
    void deleteAllReport();

    @Query("DELETE FROM tbl_laporan WHERE uid= :uid")
    void deleteSingleReport(int uid);
}
