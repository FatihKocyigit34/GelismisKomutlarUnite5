package com.example.gelismiskomutlarunite5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SS_168_Activity extends AppCompatActivity {

    Button btnTopla, btnCikar, btnCarp, btnBol;
    EditText txt1, txt2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss_168_activity);

        btnTopla = findViewById(R.id.btnSsCalistir165_Topla);
        btnTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(txt1.getText().toString());
                int sayi2 = Integer.parseInt(txt2.getText().toString());

                int toplam = uyg3calistirtoplama(sayi1, sayi2);
                Toast.makeText(getApplicationContext(), "Sonuç: " + toplam, Toast.LENGTH_SHORT).show();
            }
        });

        btnCikar = findViewById(R.id.btnSsCalistir165_Cikar);
        btnCikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(txt1.getText().toString());
                int sayi2 = Integer.parseInt(txt2.getText().toString());

                int cikarma = uyg3calistircikarma(sayi1, sayi2);
                Toast.makeText(getApplicationContext(), "Sonuç: " + cikarma, Toast.LENGTH_SHORT).show();
            }
        });

        btnBol = findViewById(R.id.btnSsCalistir165_Bolme);
        btnBol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(txt1.getText().toString());
                int sayi2 = Integer.parseInt(txt2.getText().toString());

                int bol = uyg3calistirbolme(sayi1, sayi2);
                Toast.makeText(getApplicationContext(), "Sonuç: " + bol, Toast.LENGTH_SHORT).show();
            }
        });

        btnCarp = findViewById(R.id.btnSsCalistir165_Carpma);
        btnCarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(txt1.getText().toString());
                int sayi2 = Integer.parseInt(txt2.getText().toString());

                int carpma = uyg3calistircarpma(sayi1, sayi2);
                Toast.makeText(getApplicationContext(), "Sonuç: " + carpma, Toast.LENGTH_SHORT).show();
            }
        });

    }

    private int uyg3calistirtoplama(int sayi1, int sayi2)
    {
            return sayi1 + sayi2;

    }

    private int uyg3calistircikarma(int sayi1, int sayi2)
    {
        return sayi1 - sayi2;
    }

    private int uyg3calistirbolme(int sayi1, int sayi2)
    {
        return sayi1 / sayi2;
    }

    private int uyg3calistircarpma(int sayi1, int sayi2)
    {
        return sayi1 * sayi2;
    }
}
