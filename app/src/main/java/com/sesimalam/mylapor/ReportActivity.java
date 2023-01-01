package com.sesimalam.mylapor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ReportActivity extends AppCompatActivity {

    EditText strNama, strKerusakan, strLokasi, strCatatan;
    TextView tvNama, tvKerusakan, tvLokasi, tvCatatan;
    Button btnKirim;
    InputDataViewModel inputDataViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        setInitLayout();
        setKirimLaporan();
    }

    private void setInitLayout() {
        tvNama = findViewById(R.id.tvNama);
        tvKerusakan = findViewById(R.id.tvKerusakan);
        tvLokasi = findViewById(R.id.tvLokasi);
        tvCatatan = findViewById(R.id.tvCatatan);
        btnKirim = findViewById(R.id.btnKirim);

        inputDataViewModel = new ViewModelProvider(this, ViewModelProvider
                .AndroidViewModelFactory
                .getInstance(this.getApplication()))
                .get(InputDataViewModel.class);
    }

    private void setKirimLaporan() {
        btnKirim.setOnClickListener(v -> {
            String strNama = etNama.getText().toString;
            String strKerusakan = etKerusakan.getText().toString;
            String strLokasi = etLokasi.getText().toString;
            String strCatatan = etCatatan.getText().toString;

            if(strNama.isEmpty() || strKerusakan.isEmpty() || strLokasi.isEmpty() || strCatatan.isEmpty()) {
                Toast.makeText(ReportActivity.this, "Data tidak boleh ada yang kosong", Toast.LENGTH_SHORT).show();
            } else {

            }
        });
    }


}