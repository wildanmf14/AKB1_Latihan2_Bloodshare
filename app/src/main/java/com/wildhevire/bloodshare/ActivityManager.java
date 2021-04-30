package com.wildhevire.bloodshare;

import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

// NIM : 10118044
// Nama : Wildan Muhammad Fikri
// Tanggal Pengerjaan : 1 Mei 2021

public class ActivityManager {
    public static void GoToActivity(AppCompatActivity current, Class next){
        Intent intent = new Intent(current, next);
        current.startActivity(intent);
    }


}
