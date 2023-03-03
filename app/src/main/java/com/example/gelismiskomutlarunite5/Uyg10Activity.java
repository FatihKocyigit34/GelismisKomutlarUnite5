package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg10Activity extends AppCompatActivity {
    Button btnAskerAtesEt, btnTankciAtesEt;
    TextView txtEmirBekleniyor;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg10_activity);
        btnAskerAtesEt = findViewById(R.id.btnAskerAtesEt);
        btnTankciAtesEt = findViewById(R.id.btnTankciAtesEt);
        txtEmirBekleniyor = findViewById(R.id.txtEmirBekleniyor);

        Asker asker = new Asker();
        Tankci tankci = new Tankci();

        btnTankciAtesEt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String mesaj = tankci.atesEt();
                txtEmirBekleniyor.setText(mesaj);
            }
        });

        btnAskerAtesEt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mesaj = asker.atesEt();
                txtEmirBekleniyor.setText(mesaj);
            }
        });
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg10Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
