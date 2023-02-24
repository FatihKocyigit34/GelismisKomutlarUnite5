package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class Uyg7Activity extends AppCompatActivity {
    Button btnCalistir;
    EditText txtYas;
    TextView txtyass;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg7_activity);
        txtyass = findViewById(R.id.txtYasCaps);
        txtYas = findViewById(R.id.txtDeger);
        btnCalistir = findViewById(R.id.btnCalistirUyg7);

        btnCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int yas = Integer.parseInt(txtYas.getText().toString());
                Personel personel = new Personel();
                personel.setYas(yas);
                txtyass.setText(Integer.toString(personel.getYas()));
            }
        });
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg7Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
