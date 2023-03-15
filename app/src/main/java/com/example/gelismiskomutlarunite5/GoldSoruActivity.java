package com.example.gelismiskomutlarunite5;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GoldSoruActivity  extends AppCompatActivity {
    Button  bir,
            iki,
            uc,
            dort,
            bes,
            alti,
            yedi,
            sekiz,
            dokuz,
            sifir,
            arti,
            eksi,
            carpi,
            bolu,
            esittir,
            sil;

    //----------------------------------------------

    TextView txtViewSonuc;

    //----------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goldsoru1_activity);
        //----------------------------------------------
        bir = findViewById(R.id.bir);
        iki = findViewById(R.id.iki);
        uc = findViewById(R.id.uc);
        dort = findViewById(R.id.dort);
        bes = findViewById(R.id.bes);
        alti = findViewById(R.id.alti);
        yedi = findViewById(R.id.yedi);
        sekiz = findViewById(R.id.sekiz);
        dokuz = findViewById(R.id.dokuz);
        sifir = findViewById(R.id.sifir);
        arti = findViewById(R.id.arti);
        eksi = findViewById(R.id.eksi);
        carpi = findViewById(R.id.carpi);
        bolu = findViewById(R.id.bolu);
        esittir = findViewById(R.id.esittir);
        sil = findViewById(R.id.sil);
        txtViewSonuc = findViewById(R.id.txtViewSonuc);

        //----------------------------------------------

        arti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn = (Button) view;
                String buttonText = btn.getText().toString();
                String sonuc = txtViewSonuc.getText().toString();
                switch (buttonText) {
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                        txtViewSonuc.setText(sonuc + " " + buttonText.toString() + " ");
                        break;
                    default:
                        txtViewSonuc.setText(sonuc + buttonText);
                }
            }
        });

        //----------------------------------------------

        eksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn = (Button) view;
                String buttonText = btn.getText().toString();
                String sonuc = txtViewSonuc.getText().toString();
                switch (buttonText) {
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                        txtViewSonuc.setText(sonuc + " " + buttonText.toString() + " ");
                        break;
                    default:
                        txtViewSonuc.setText(sonuc + buttonText);
                }
            }
        });

        //----------------------------------------------

        carpi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Button btn = (Button) view;
                String buttonText = btn.getText().toString();
                String sonuc = txtViewSonuc.getText().toString();
                switch (buttonText) {
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                        txtViewSonuc.setText(sonuc + " " + buttonText.toString() + " ");
                        break;
                    default:
                        txtViewSonuc.setText(sonuc + buttonText);
                }
            }
        });
        //----------------------------------------------

        bolu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Button btn = (Button) view;
                String buttonText = btn.getText().toString();
                String sonuc = txtViewSonuc.getText().toString();
                switch (buttonText) {
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                        txtViewSonuc.setText(sonuc + " " + buttonText.toString() + " ");
                        break;
                    default:
                        txtViewSonuc.setText(sonuc + buttonText);
                }
            }
        });

        //----------------------------------------------

        esittir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String sonucc = txtViewSonuc.getText().toString();
                String[] sonucDizisi = sonucc.split(" ");

                Log.d("ad", sonucDizisi[0] + " " + sonucDizisi[1] + " " + sonucDizisi[2]);

                int sayi1 = Integer.parseInt(sonucDizisi[0]), sayi2 = Integer.parseInt(sonucDizisi[2]);
                String islem = sonucDizisi[1];

                GoldSoru1_DortIslem sonuc = new GoldSoru1_DortIslem(sayi1, sayi2, islem);

                txtViewSonuc.setText(sonucc + " = " + sonuc.sonuc);
            }
        });

        //----------------------------------------------

        sil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                txtViewSonuc.setText("");
            }
        });

        //----------------------------------------------

    }
}
