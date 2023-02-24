package com.example.gelismiskomutlarunite5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnUyg1(View view) {
        Intent uyg = new Intent(MainActivity.this, Uyg1Activity.class);
        startActivity(uyg);
    }

    public void btnUyg2(View view) {
        Intent uyg = new Intent(MainActivity.this, Uyg2Activity.class);
        startActivity(uyg);
    }

    public void btnUyg3(View view) {
        Intent uyg = new Intent(MainActivity.this, Uyg3Activity.class);
        startActivity(uyg);
    }

    public void btnUyg4(View view) {
        Intent uyg = new Intent(MainActivity.this, Uyg4Activity.class);
        startActivity(uyg);
    }

    public void btnUyg5(View view) {
        Intent uyg = new Intent(MainActivity.this, Uyg5Activity.class);
        startActivity(uyg);
    }

    public void btnUyg6(View view) {
        Intent uyg = new Intent(MainActivity.this, Uyg6Activity.class);
        startActivity(uyg);
    }

    public void btnUyg7(View view) {
        Intent uyg = new Intent(MainActivity.this, Uyg7Activity.class);
        startActivity(uyg);
    }

    public void btnUyg8(View view) {
        Intent uyg = new Intent(MainActivity.this, Uyg8Activity.class);
        startActivity(uyg);
    }

    public void btnUyg9(View view) {
        Intent uyg = new Intent(MainActivity.this, Uyg9Activity.class);
        startActivity(uyg);
    }

    public void btnUyg10(View view) {
        Intent uyg = new Intent(MainActivity.this, Uyg10Activity.class);
        startActivity(uyg);
    }

    public void btnUyg11(View view) {
        Intent uyg = new Intent(MainActivity.this, Uyg11Activity.class);
        startActivity(uyg);
    }

    public void btnUyg12(View view) {
        Intent uyg = new Intent(MainActivity.this, Uyg12Activity.class);
        startActivity(uyg);
    }

    public void btnUyg13(View view) {
        Intent uyg = new Intent(MainActivity.this, Uyg13Activity.class);
        startActivity(uyg);
    }

    public void btnSs165(View view) {
        Intent uyg = new Intent(MainActivity.this, SS_165_Activitiy.class);
        startActivity(uyg);
    }

    public void btnSs168(View view) {
        Intent uyg = new Intent(MainActivity.this, SS_168_Activity.class);
        startActivity(uyg);
    }

    public void btnSs173(View view) {
        Intent uyg = new Intent(MainActivity.this, SS_173_Activity.class);
        startActivity(uyg);
    }

    public void btnSs188(View view) {
        Intent uyg = new Intent(MainActivity.this, SS_188_Activity.class);
        startActivity(uyg);
    }
}