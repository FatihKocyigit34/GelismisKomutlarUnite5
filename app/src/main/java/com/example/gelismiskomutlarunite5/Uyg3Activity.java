package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg3Activity extends AppCompatActivity {

    Button btn1;
    EditText txt1, txt2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg3_activity);
        btn1 = findViewById(R.id.btnUyg3Calistir1);
        txt1 = findViewById(R.id.editTxtUyg3_1);
        txt2 = findViewById(R.id.editTxtUyg3_2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(txt1.getText().toString());
                int sayi2 = Integer.parseInt(txt2.getText().toString());

                int toplam = uyg3calistir(sayi1, sayi2);
                Toast.makeText(getApplicationContext(), "Sonuç: " + toplam, Toast.LENGTH_SHORT).show();
            }
        });

    }

    private int uyg3calistir(int sayi1, int sayi2)
    {
        return sayi1 + sayi2;
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg3Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
