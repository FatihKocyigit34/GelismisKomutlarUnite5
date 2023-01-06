package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SS_165_Activitiy extends AppCompatActivity {
    Button btn1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss_165_activity);
        btn1 = findViewById(R.id.btnSsCalistir165);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss165();
            }
        });

    }

    public void ss165()
    {
        int sayi1 = 10;
        int sayi2 = 5;
        int sonuc = sayi1 + sayi2;
        Toast.makeText(this, "Sonuç: " + sonuc, Toast.LENGTH_SHORT).show();
    }


    public void btnBack(View view) {
        Intent uyg = new Intent(SS_165_Activitiy.this, MainActivity.class);
        startActivity(uyg);
    }
}
