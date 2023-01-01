package com.sesimalam.mylapor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    CardView cvLaporan, cvHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setInitLayout();
    }

    private void setInitLayout() {
        cvLaporan = findViewById(R.id.cvLaporan);
        cvHistory = findViewById(R.id.cvHistory);

        cvLaporan.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, ReportActivity.class);
            startActivity(intent);
        });

        cvHistory.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, ReportActivity.class);
            startActivity(intent);
        });
    }
}