package com.sesimalam.mylapor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.sesimalam.mylapor.room.ModelDatabase;

import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends AppCompatActivity implements HistoryAdapter.HistoryAdapterCallback {

    List<ModelDatabase> modelDatabaseList = new ArrayList<>();
    HistoryAdapter historyAdapter;
    HistoryViewModel historyViewModel;
    RecyclerView rvHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        setInitLayout();
        setViewModel();
    }

    private void setInitLayout() {
        rvHistory = findViewById(R.id.rvHistory);

        historyAdapter = new HistoryAdapter(this, modelDatabaseList, this);
        rvHistory.setHasFixedSize(true);
        rvHistory.setLayoutManager(new LinearLayoutManager(this));
        rvHistory.setAdapter(historyAdapter);
    }

    private void setViewModel() {
        historyViewModel = ViewModelProviders.of(this).get(HistoryViewModel.class);
        historyViewModel.getDataLaporan.observe(this, modelDatabases -> {
            historyAdapter.setDataAdapter(modelDatabases);
                }
        );
    }

    public static void setWindowFlag(Activity activity, final int bits, boolean on) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams layoutParams = window.getAttributes();
        if (on) {
            layoutParams.flags |= bits;
        } else {
            layoutParams.flags &= ~bits;
        }
        window.setAttributes(layoutParams);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}