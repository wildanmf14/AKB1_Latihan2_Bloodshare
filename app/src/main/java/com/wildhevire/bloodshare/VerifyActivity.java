package com.wildhevire.bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

// NIM : 10118044
// Nama : Wildan Muhammad Fikri
// Tanggal Pengerjaan : 1 Mei 2021

public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }

    public void GoToHome(View view){
        ActivityManager.GoToActivity(this, HomeActivity.class);
    }
}