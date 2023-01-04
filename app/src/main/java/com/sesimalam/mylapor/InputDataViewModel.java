package com.sesimalam.mylapor;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;

import com.sesimalam.mylapor.room.DatabaseClient;
import com.sesimalam.mylapor.room.LaporanDao;
import com.sesimalam.mylapor.room.ModelDatabase;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.schedulers.Schedulers;

//public class InputDataViewModel extends AndroidViewModel {

   // LaporanDao laporanDao;

   // public InputDataViewModel(@NonNull Application application) {
   //     super(application);

     //   laporanDao = DatabaseClient.getInstance(application).getAppDatabase().laporanDao();
   // }

   // public void addLaporan(final String nama, final String kerusakan, final String lokasi, final String catatan) {
   //     Completable.fromAction(() -> {

     //               ModelDatabase modelDatabase = new ModelDatabase();
       //             modelDatabase.nama = nama;
         //           modelDatabase.kerusakan = kerusakan;
           //         modelDatabase.lokasi = lokasi;
             //       modelDatabase.catatan = catatan;
               //     laporanDao.insertData(modelDatabase);
               // })
           //     .subscribeOn(Schedulers.io())
             //   .observeOn(AndroidSchedulers.mainThread())
             //   .subscribe();
 //   }

  //  }

