package com.example.gelismiskomutlarunite5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SS_173_Activity extends AppCompatActivity {
    Button btnMerhaba1, btnMerhaba2;
    EditText txtAd, txtSoyad;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss_173_activity);
        btnMerhaba1 = findViewById(R.id.btnMerhaba1);
        btnMerhaba2 = findViewById(R.id.btnMerhaba2);
        txtAd = findViewById(R.id.editTxtAd);
        txtSoyad = findViewById(R.id.editTxtSoyad);

        btnMerhaba1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isim = txtAd.getText().toString();
                String soyisim = txtSoyad.getText().toString();
                Toast.makeText(getApplicationContext(), merhaba(isim, soyisim) ,Toast.LENGTH_SHORT).show();

            }
        });

        btnMerhaba2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isim = txtAd.getText().toString();
                Toast.makeText(getApplicationContext(), merhaba(isim) ,Toast.LENGTH_SHORT).show();
            }
        });


    }

    private String merhaba (String isim)
    {
        return  "Merhaba " + isim.toString();
    }

    private String merhaba (String isim, String soyisim)
    {
        return  "İyi Günler " + isim.toString() + " " + soyisim.toString();
    }
}
