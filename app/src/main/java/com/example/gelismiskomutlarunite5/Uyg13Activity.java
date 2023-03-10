package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Uyg13Activity extends AppCompatActivity {
    Oyuncu oyuncu1;
    Oyuncu oyuncu2;
    Button btnTopcuOyuncu1, btnTopcuOyuncu2, btnTankciOyuncu1, btnTankciOyuncu2;
    EditText editTxtTankciAtesGucu, editTxtTopcuAtesGucu;
    TextView txtSavasOyunu, txtHasar,txtOyuncu1,txtOyuncu2;
    ProgressBar progBarOyuncu1, progBarOyuncu2;
    Integer isabet;
    ArrayList<Oyuncu> oyuncular = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg13_activity);
        oyuncu1 = new Oyuncu(100,"Oyuncu 1");
        oyuncu2 = new Oyuncu(100,"Oyuncu 2");
        oyuncular.add(oyuncu1);
        oyuncular.add(oyuncu2);
        btnTopcuOyuncu1 = findViewById(R.id.btnTopcuOyuncu1);
        btnTopcuOyuncu2 = findViewById(R.id.btnTopcuOyuncu2);
        btnTankciOyuncu1 = findViewById(R.id.btnTankciOyuncu1);
        btnTankciOyuncu2 = findViewById(R.id.btnTankciOyuncu2);
        editTxtTankciAtesGucu = findViewById(R.id.editTxtTankciHasar);
        editTxtTopcuAtesGucu = findViewById(R.id.editTxtTopcuHasar);
        txtHasar = findViewById(R.id.txtHasar);
        txtOyuncu1 = findViewById(R.id.txtOyuncu1);
        txtOyuncu2 = findViewById(R.id.txtOyuncu2);
        progBarOyuncu1 = findViewById(R.id.progressBarOyuncu1);
        progBarOyuncu2 = findViewById(R.id.progressBarOyuncu2);
        txtSavasOyunu = findViewById(R.id.txtSavasOyunu);

        //-----------------------------------------------------------------------------

        btnTankciOyuncu1.setOnClickListener(view -> {
            isabet = oyuncu1.tankci.atesEt(oyuncu2);
            progBarOyuncu2.setProgress(oyuncu2.getCan());
            txtHasar.setText(isabet.toString());
            oyuncuKontrolet();
        });

        btnTopcuOyuncu1.setOnClickListener(view -> {
            isabet = oyuncu1.topcu.atesEt(oyuncu2);
            progBarOyuncu2.setProgress(oyuncu2.getCan());
            txtHasar.setText(isabet.toString());
            oyuncuKontrolet();
        });

        //-----------------------------------------------------------------------------

        btnTankciOyuncu2.setOnClickListener(view -> {
            isabet = oyuncu2.tankci.atesEt(oyuncu1);
            progBarOyuncu1.setProgress(oyuncu1.getCan());
            txtHasar.setText(isabet.toString());
            oyuncuKontrolet();
        });
        btnTopcuOyuncu2.setOnClickListener(view -> {
            isabet = oyuncu2.topcu.atesEt(oyuncu1);
            progBarOyuncu1.setProgress(oyuncu1.getCan());
            txtHasar.setText(isabet.toString());
            oyuncuKontrolet();
        });

        //-----------------------------------------------------------------------------

        
        }

    private void oyuncuKontrolet() {
        for (Oyuncu oyuncu:oyuncular) {
            if (oyuncu.getCan()<=0 )
                txtHasar.setText("Oyun Bitti");
        }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg13Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
