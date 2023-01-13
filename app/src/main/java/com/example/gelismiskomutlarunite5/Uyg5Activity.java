package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg5Activity extends AppCompatActivity {
    Button btnHesapla;
    EditText editTxtCihazAdi, editTxtCihazGucu, editTxtGunlukKullanim;
    TextView txtAylik;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg5_activity);
        btnHesapla = findViewById(R.id.btnHesapla_Uyg5);
        editTxtCihazAdi = findViewById(R.id.edtTxtCihazAdi);
        editTxtCihazGucu = findViewById(R.id.editTxtCihazGucu);
        editTxtGunlukKullanim = findViewById(R.id.editTxtGunlukKullanim);
        txtAylik = findViewById(R.id.txtAylikKullanim);

        btnHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cihazAdi = editTxtCihazAdi.getText().toString();
                int cihazGucu = Integer.parseInt( editTxtCihazGucu.getText().toString());
                int gunlukKullanim = Integer.parseInt(editTxtGunlukKullanim.getText().toString());

                ElektrikliCihaz cihaz = new ElektrikliCihaz();
                cihaz.cihazGucuKw = cihazGucu;
                cihaz.gunlukKullanim = gunlukKullanim;
                cihaz.cihazAdi = cihazAdi;
                int sonuc = cihaz.AylikKullanim();
                txtAylik.setText("Aylık Kullandığınız Kw: " + cihaz.AylikKullanim());
                txtAylik.setVisibility(View.VISIBLE);


            }
        });
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg5Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
