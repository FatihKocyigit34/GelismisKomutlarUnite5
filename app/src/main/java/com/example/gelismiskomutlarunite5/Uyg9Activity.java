package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg9Activity extends AppCompatActivity {
    Button btnKareCevre, btnUcgenCevre;
    TextView txtCevre;
    EditText editTxtUzunluk;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg9_activity);
        btnKareCevre = findViewById(R.id.btnKareCevre);
        btnUcgenCevre = findViewById(R.id.btnUcgenCevre);
        txtCevre = findViewById(R.id.txtCevreUyg9);
        editTxtUzunluk = findViewById(R.id.editTxtKenarSayisi);

        btnUcgenCevre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer uzunluk = Integer.parseInt(editTxtUzunluk.getText().toString());
                Ucgen ucgen = new Ucgen(uzunluk);
                Integer cevre = ucgen.cevrebul();
                txtCevre.setText(cevre.toString());
            }
        });

        btnKareCevre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer uzunluk = Integer.parseInt(editTxtUzunluk.getText().toString());
                Uyg9Kare kare = new Uyg9Kare(uzunluk);
                Integer cevreee = kare.cevre();
                txtCevre.setText(cevreee.toString());
            }
        });
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg9Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
