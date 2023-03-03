package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SS_206_Activity extends AppCompatActivity {
    Button btnAskerAtesEt, btnTankciAtesEt, btnTopcuAtesEt;
    TextView txtEmirBekleniyor;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss_206_activity);

        btnAskerAtesEt = findViewById(R.id.btnAskerAtesEt);
        btnTankciAtesEt = findViewById(R.id.btnTankciAtesEt);
        btnTopcuAtesEt = findViewById(R.id.btnTopcuAtesEt);

        txtEmirBekleniyor = findViewById(R.id.txtEmirBekleniyor);

        Asker asker = new Asker();
        Tankci tankci = new Tankci();
        Topcu topcu = new Topcu();

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

        btnTopcuAtesEt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mesaj = topcu.atesEt();
                txtEmirBekleniyor.setText(mesaj);
            }
        });

    }
    public void btnBack(View view) {
        Intent uyg = new Intent(SS_206_Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
