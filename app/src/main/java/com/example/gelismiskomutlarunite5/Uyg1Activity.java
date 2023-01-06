package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg1Activity extends AppCompatActivity {
    Button btn1,btn2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg1_activity);
        btn1 = findViewById(R.id.btnUyg1Calistir);
        btn2 = findViewById(R.id.btnUyg1Calistir2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selamver();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            selamver();
            }
        });
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg1Activity.this, MainActivity.class);
        startActivity(uyg);
    }

    public void selamver()
    {
        Toast.makeText(this, "Merhaba Arkadaşlar Ben Cafo", Toast.LENGTH_LONG).show();
    }

}
