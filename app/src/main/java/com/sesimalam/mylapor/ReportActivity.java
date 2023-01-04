package com.sesimalam.mylapor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.sesimalam.mylapor.room.LaporanDao;
import com.sesimalam.mylapor.room.ModelDatabase;

import java.util.List;

public class ReportActivity extends AppCompatActivity {

    EditText etNama, etKerusakan, etLokasi, etCatatan;
    Button insertData;
   // InputDataViewModel inputDataViewModel;
    ModelDatabase modelDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        etNama = findViewById(R.id.etNama);
        etKerusakan = findViewById(R.id.etKerusakan);
        etLokasi = findViewById(R.id.etLokasi);
        etCatatan = findViewById(R.id.etCatatan);
        insertData = findViewById(R.id.btnKirim);

        insertData.setOnClickListener(view -> {
            if (
                    !etNama.getText().toString().isEmpty()&&etKerusakan.getText().toString().isEmpty()&&
                    etLokasi.getText().toString().isEmpty()&&etCatatan.getText().toString().isEmpty()) {

                modelDatabase = new ModelDatabase();
                modelDatabase.setNama(etNama.getText().toString());
                modelDatabase.setKerusakan(etKerusakan.getText().toString());
                modelDatabase.setLokasi(etLokasi.getText().toString());
                modelDatabase.setCatatan(etCatatan.getText().toString());

                db.laporanDao().insertAll(modelDatabase);
                    } else {
                        Toast.makeText(getApplicationContext(),"Mohon isi semua dengan benar",
                                Toast.LENGTH_SHORT).show();
                }
        });
    //    setInitLayout();
     //   setKirimLaporan();
    }

 //   private void setInitLayout() {
 //       tvNama = findViewById(R.id.tvNama);
   //     tvKerusakan = findViewById(R.id.tvKerusakan);
     //   tvLokasi = findViewById(R.id.tvLokasi);
       // tvCatatan = findViewById(R.id.tvCatatan);
    //    btnKirim = findViewById(R.id.btnKirim);

   //     inputDataViewModel = new ViewModelProvider(this, ViewModelProvider
  //              .AndroidViewModelFactory
    //            .getInstance(this.getApplication()))
      //          .get(InputDataViewModel.class);
  //  }

 //   private void setKirimLaporan() {
 //       btnKirim.setOnClickListener(v -> {
    //           String strNama = etNama.getText().toString();
   //         String strKerusakan = etKerusakan.getText().toString();
  //          String strLokasi = etLokasi.getText().toString();
  //          String strCatatan = etCatatan.getText().toString();
//
//            if(strNama.isEmpty() || strKerusakan.isEmpty() || strLokasi.isEmpty() || strCatatan.isEmpty()) {
  //              Toast.makeText(ReportActivity.this, "Data tidak boleh ada yang kosong", Toast.LENGTH_SHORT).show();
    //        } else {
      //          inputDataViewModel.addLaporan(strNama, strLokasi, strKerusakan, strCatatan);
        //        Toast.makeText(ReportActivity.this, "Laporan anda sudah terkirim", Toast.LENGTH_SHORT).show();
          //      finish();
        //    }
     //   });
 //   }

}