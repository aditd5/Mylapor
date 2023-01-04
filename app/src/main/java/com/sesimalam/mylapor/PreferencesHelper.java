package com.sesimalam.mylapor;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferencesHelper {
    private static PreferencesHelper INSTANCE;
    private SharedPreferences sharedPreferences;

    private PreferencesHelper(Context context) {
        sharedPreferences = context
                .getApplicationContext()
                .getSharedPreferences("com.sesimalam.mylapor", Context.MODE_PRIVATE);
    }

    public static PreferencesHelper getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new PreferencesHelper(context);
        }
        return INSTANCE;
    }

    public SharedPreferences preferences() {return sharedPreferences;}

    public void setLogin(boolean islogin) {
        sharedPreferences.edit().putBoolean("islogin", islogin).apply();
    }

    public Boolean isLogin() {
        return sharedPreferences.getBoolean("islogin", false);
    }

    public void setNama(String nama) {
        sharedPreferences.edit().putString("nama", nama).apply();
    }

    public String getNama() {
        return sharedPreferences.getString("nama","John Doe");
    }
}
