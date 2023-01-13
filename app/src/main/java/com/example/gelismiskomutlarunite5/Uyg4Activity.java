package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg4Activity extends AppCompatActivity {
    Button btn2SayiTopla, btn3SayiTopla;
    EditText sayi1, sayi2, sayi3;
    TextView sayiTopla2Txt, sayi3ToplaTxt;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg4_activity);
        btn2SayiTopla = findViewById(R.id.btn2SayiyiTopla);
        btn3SayiTopla = findViewById(R.id.btn3SayiyiTopla);
        sayi1 = findViewById(R.id.editTxtSayi1_Uyg4);
        sayi2 = findViewById(R.id.editTxtSayi2_Uyg4);
        sayi3 = findViewById(R.id.editTxtSayi3_Uyg4);
        sayiTopla2Txt = findViewById(R.id.txt2SayiyiTopla);
        sayi3ToplaTxt = findViewById(R.id.txt3SayiyiTopla);

        btn2SayiTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayii1 = Integer.parseInt(sayi1.getText().toString());
                int sayii2 = Integer.parseInt(sayi2.getText().toString());
                int sonuc = topla(sayii1, sayii2);
                sayiTopla2Txt.setText("İki Sayının Toplamı: " + sonuc);
                sayiTopla2Txt.setVisibility(View.VISIBLE);
            }
        });

        btn3SayiTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayii1 = Integer.parseInt(sayi1.getText().toString());
                int sayii2 = Integer.parseInt(sayi2.getText().toString());
                int sayii3 = Integer.parseInt(sayi3.getText().toString());
                int sonuc = topla(sayii1, sayii2, sayii3);
                sayi3ToplaTxt.setText("Üç Sayının Toplamı: " + sonuc);
                sayi3ToplaTxt.setVisibility(View.VISIBLE);
            }
        });


    }

    private int topla ( int sayii1, int sayii2)
    {
        return sayii1 + sayii2;
    }

    private int topla ( int sayii1, int sayii2, int sayii3)
    {
        return sayii1 + sayii2 + sayii3;
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg4Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
