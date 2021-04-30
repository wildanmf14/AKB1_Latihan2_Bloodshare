package com.wildhevire.bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

// NIM : 10118044
// Nama : Wildan Muhammad Fikri
// Tanggal Pengerjaan : 1 Mei 2021

public class RegisterActivity extends AppCompatActivity {
    private String[] goldar, reshus, job;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        goldar = getResources().getStringArray(R.array.goldar);
        reshus = getResources().getStringArray(R.array.reshus);
        job = getResources().getStringArray(R.array.job);
        PopulateSpinner();
    }
    private void PopulateSpinner(){
        Spinner goldarSpinner = findViewById(R.id.regis_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(RegisterActivity.this, android.R.layout.simple_spinner_dropdown_item, goldar);
        goldarSpinner.setAdapter(adapter);

        Spinner reshusSpinner = findViewById(R.id.regis_spinner2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(RegisterActivity.this, android.R.layout.simple_spinner_dropdown_item, reshus);
        reshusSpinner.setAdapter(adapter2);

        Spinner pekerjaanSpinner = findViewById(R.id.regis_spinner3);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(RegisterActivity.this, android.R.layout.simple_spinner_dropdown_item, job);
        pekerjaanSpinner.setAdapter(adapter3);
    }
    public void GoToAlmost(View view){
        ActivityManager.GoToActivity(this, AlmostThereActivity.class);
    }
    public void GoToLogin(View view) {
        ActivityManager.GoToActivity(this, LoginActivity.class);
    }




}