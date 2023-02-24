package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SS_188_Activity extends AppCompatActivity {
    Button btnGeriDon188;
    Button EsKenarUcgen;
    Button IkızKenarUcgen;
    Button CesitKenarUcgen;
    TextView txtCevre;
    EditText kenarr1;
    EditText kenarr2;
    EditText kenarr3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss_188_activity);
        kenarr1 = findViewById(R.id.txtAlan1);
        kenarr2 = findViewById(R.id.txtAlan2);
        kenarr3 = findViewById(R.id.txtAlan3);
        txtCevre = findViewById(R.id.txtCevre);

        EsKenarUcgen = findViewById(R.id.btnEsKenarUcgen);
        EsKenarUcgen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Integer kenaar1;
            Integer cevre;
            int kenarrr1 = Integer.parseInt(kenarr1.getText().toString());
                Ucgen eskenar = new Ucgen(kenarrr1);
                cevre = eskenar.cevrebul();
                txtCevre.setText(cevre.toString());
            }
        });

        IkızKenarUcgen = findViewById(R.id.btnIkızKenarUcgen);
        IkızKenarUcgen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer kenaar1;
                Integer kenaar2;
                Integer cevre;
                int kenarrr1 = Integer.parseInt(kenarr1.getText().toString());
                int kenarrr2 = Integer.parseInt(kenarr2.getText().toString());
                Ucgen ikizkenar = new Ucgen(kenarrr1, kenarrr2);
                cevre = ikizkenar.cevrebul();
                txtCevre.setText(cevre.toString());
            }
        });

        CesitKenarUcgen = findViewById(R.id.btnCesitKenarUcgen);
        CesitKenarUcgen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer kenaar1;
                Integer kenaar2;
                Integer kenaar3;
                Integer cevre;
                int kenarrr1 = Integer.parseInt(kenarr1.getText().toString());
                int kenarrr2 = Integer.parseInt(kenarr2.getText().toString());
                int kenarrr3 = Integer.parseInt(kenarr3.getText().toString());
                Ucgen cesitkenar = new Ucgen(kenarrr1, kenarrr2,kenarrr3);
                cevre = cesitkenar.cevrebul();
                txtCevre.setText(cevre.toString());
            }
        });

        btnGeriDon188 = findViewById(R.id.btnGeriDon_188);
        btnGeriDon188.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg = new Intent(SS_188_Activity.this, MainActivity.class);
                startActivity(uyg);
            }
        });
    }


}
