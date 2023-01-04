package com.sesimalam.mylapor;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.sesimalam.mylapor.room.DatabaseClient;
import com.sesimalam.mylapor.room.LaporanDao;
import com.sesimalam.mylapor.room.ModelDatabase;

import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class HistoryViewModel extends AndroidViewModel {

    LiveData<List<ModelDatabase>> modelLaundry;
    LaporanDao laporanDao;

    public HistoryViewModel(@NonNull Application application) {
        super(application);

        laporanDao = DatabaseClient.getInstance(application).getAppDatabase().laporanDao();
        modelLaundry = laporanDao.getAllReport();

    }

    public LiveData<List<ModelDatabase>> getDataLaporan() {
        return modelLaundry;
    }

    public void deleteDataById(final int uid) {
        Completable.fromAction(() -> laporanDao.deleteSingleReport(uid))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe();
    }
}

