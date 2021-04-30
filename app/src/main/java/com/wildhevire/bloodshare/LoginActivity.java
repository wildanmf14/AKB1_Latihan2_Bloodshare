package com.wildhevire.bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

// NIM : 10118044
// Nama : Wildan Muhammad Fikri
// Tanggal Pengerjaan : 1 Mei 2021

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void GoToRegister(View view){
        ActivityManager.GoToActivity(this, RegisterActivity.class);
    }

}