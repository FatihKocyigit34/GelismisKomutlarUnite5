package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg8Activity extends AppCompatActivity {
    Button btnMinibusKapiSayisi,btnMinibusMaksHiz, btnMinibusCalistir, btnMinibusYolcular, btnArabaCalistir,btnArabaKapiSayisi,btnArabaMaksHiz, btnArabaIseGit;
    TextView txtAracBilgisi;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg8_activity);
        btnMinibusKapiSayisi = findViewById(R.id.btnMinibusKapiSayisi);
        btnMinibusMaksHiz = findViewById(R.id.btnMinibusMaksHiz);
        btnMinibusCalistir = findViewById(R.id.btnMinibusuCalistir);
        btnMinibusYolcular = findViewById(R.id.btnMinibusYolcular);
        btnArabaCalistir = findViewById(R.id.btnArabayiCalistir);
        btnArabaKapiSayisi = findViewById(R.id.btnArabaKapiSayisi);
        btnArabaMaksHiz = findViewById(R.id.btnArabaMaksHiz);
        btnArabaIseGit = findViewById(R.id.btnArabaIseGit);
        txtAracBilgisi = findViewById(R.id.txtAracBilgisi);

        Araba araba = new Araba();

        araba.setAracKapiSayisi(4);
        araba.setAracMaksimumHiz(180);

        Minibus minibus = new Minibus();

        minibus.setAracKapiSayisi(6);
        minibus.setAracMaksimumHiz(160);


        btnMinibusKapiSayisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtAracBilgisi.setText(minibus.AracKapiSayisi.toString());
            }
        });

        btnMinibusMaksHiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtAracBilgisi.setText(minibus.AracMaksimumHiz.toString());
            }
        });

        btnMinibusCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtAracBilgisi.setText(minibus.calistir());
            }
        });

        btnMinibusYolcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtAracBilgisi.setText(minibus.yolculariIndir());
            }
        });

        btnArabaKapiSayisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtAracBilgisi.setText(araba.AracKapiSayisi);
            }
        });

        btnArabaMaksHiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtAracBilgisi.setText(araba.AracMaksimumHiz);
            }
        });

        btnArabaCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtAracBilgisi.setText(araba.calistir());
            }
        });

        btnArabaIseGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtAracBilgisi.setText(araba.iseGit());
            }
        });
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg8Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
