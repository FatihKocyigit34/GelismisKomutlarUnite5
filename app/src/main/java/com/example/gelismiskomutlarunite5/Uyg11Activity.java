package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg11Activity extends AppCompatActivity {
    Integer notlar[] = new Integer[6];
    Integer Indeks = 0;

    Button btnCalistir, btnSifirla;
    TextView txtIndeks, txtToplam;
    EditText editTxtNotlar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg11_activity);
        btnCalistir = findViewById(R.id.btnCalistirUyg11);
        btnSifirla = findViewById(R.id.btnSifirla);
        txtIndeks = findViewById(R.id.txtIndeks);
        txtToplam = findViewById(R.id.txtToplamUyg11);
        editTxtNotlar = findViewById(R.id.editTxtNotlar);

        btnCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Indeks < 6){
                    int sayi;
                    sayi = Integer.parseInt(editTxtNotlar.getText().toString());
                    notlar[Indeks]=sayi;
                    Indeks++;
                    txtIndeks.setText("İndeks: " + Integer.toString(Indeks));
                    int toplam = 0;
                    for (int i = 0; i < Indeks; i++) {
                        toplam += notlar[i];
                    }
                    txtToplam.setText("Toplam: " + Integer.toString(toplam));
                    editTxtNotlar.getText().clear();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Dizi Doldu", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnSifirla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Indeks = 0;
                notlar = new Integer[6];
                txtIndeks.setText("İndeks: 0");
                txtToplam.setText("Toplam: 0");
                editTxtNotlar.getText().clear();

            }
        });
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg11Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
