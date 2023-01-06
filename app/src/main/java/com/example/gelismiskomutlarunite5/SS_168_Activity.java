package com.example.gelismiskomutlarunite5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SS_168_Activity extends AppCompatActivity {


    EditText textNumber1, textNumber2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss_168_activity);

        textNumber1 = findViewById(R.id.editTxtSs168_1);
        textNumber2 = findViewById(R.id.editTxtSs168_2);
    }

    public void btnToplama(View view) {
        int result = hesapla(Integer.parseInt(textNumber1.getText().toString()), Integer.parseInt(textNumber2.getText().toString()), "+");
        Toast.makeText(this, "Toplam: " + result, Toast.LENGTH_SHORT).show();
    }

    public void btnCikarma(View view) {
        int result = hesapla(Integer.parseInt(textNumber1.getText().toString()), Integer.parseInt(textNumber2.getText().toString()), "-");
        Toast.makeText(this, "Çıkarma: " + result, Toast.LENGTH_SHORT).show();
    }

    public void btnCarpma(View view) {
        int result = hesapla(Integer.parseInt(textNumber1.getText().toString()), Integer.parseInt(textNumber2.getText().toString()), "*");
        Toast.makeText(this, "Çarpma: " + result, Toast.LENGTH_SHORT).show();
    }

    public void btnBolme(View view) {
        int result = hesapla(Integer.parseInt(textNumber1.getText().toString()), Integer.parseInt(textNumber2.getText().toString()), "/");
        Toast.makeText(this, "Bölme: " + result, Toast.LENGTH_SHORT).show();
    }

    public int hesapla(int sayi1, int sayi2, String islem) {
        int number = 0;
        if(islem == "+") number = sayi1 + sayi2;
        else if(islem == "-") number = sayi1 - sayi2;
        else if(islem == "*") number = sayi1 * sayi2;
        else if(islem == "/") number = sayi1 / sayi2;
        return number;
    }
}