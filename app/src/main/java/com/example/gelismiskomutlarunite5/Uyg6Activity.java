package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg6Activity extends AppCompatActivity {
    TextView txtAlan;
    EditText txtUzunKenar;
    EditText txtKısaKenar;
    Button btnKareKenar;
    Button btnDortgenKenar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg6_activity);
        txtAlan = findViewById(R.id.txtAlan);
        txtKısaKenar = findViewById(R.id.txtKisaKenar);
        txtUzunKenar = findViewById(R.id.txtUzunKenar);
        btnKareKenar = findViewById(R.id.btnKareAlan);
        btnDortgenKenar = findViewById(R.id.btnDikdortgenAlan);

        btnDortgenKenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer uzunkenar;
                Integer kisakenar;
                Integer alan;
            int uzunKenar = Integer.parseInt(txtUzunKenar.getText().toString());
            int kisaKenar = Integer.parseInt(txtKısaKenar.getText().toString());
            Dikdortgen dortgen = new Dikdortgen(uzunKenar,kisaKenar);
            alan = dortgen.alanbul();
            txtAlan.setText(alan.toString());
            }
        });

        btnKareKenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer kisakenar;
                Integer alan;
                int kisaKenar = Integer.parseInt(txtKısaKenar.getText().toString());
                Dikdortgen kare = new Dikdortgen(kisaKenar);
                alan = kare.alanbul();
                txtAlan.setText(alan.toString());
            }
        });
    }


    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg6Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
