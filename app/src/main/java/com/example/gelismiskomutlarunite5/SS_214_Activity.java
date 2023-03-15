package com.example.gelismiskomutlarunite5;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SS_214_Activity extends AppCompatActivity {
    Button btnEkleSs214;
    EditText txtAd;
    EditText txtNo;
    ListView listAdlar;
    ListView listNolar;
    ArrayList<String> adlarListesi = new ArrayList<>();
    ArrayList<String> nolarListesi = new ArrayList<>();
    ArrayAdapter<String> adAdapter, noAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //----------------------------------------------
        setContentView(R.layout.ss_214_activity);
        btnEkleSs214 = findViewById(R.id.btnEkleSs214);
        txtAd = findViewById(R.id.editTxtAdSs214);
        txtNo = findViewById(R.id.editTxtSoyadSs214);
        listAdlar = findViewById(R.id.listeAdlar);
        listNolar = findViewById(R.id.listeNolar);
        //----------------------------------------------
        adAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, adlarListesi);
        noAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, nolarListesi);
        //----------------------------------------------
        listAdlar.setAdapter(adAdapter);
        listNolar.setAdapter(noAdapter);
        //----------------------------------------------
        btnEkleSs214.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ad = txtAd.getText().toString();
                adlarListesi.add(ad);
                adAdapter.notifyDataSetChanged();
                txtAd.getText().clear();

                String no = txtNo.getText().toString();
                nolarListesi.add(no);
                noAdapter.notifyDataSetChanged();
                txtNo.getText().clear();
            }
        });
    }

}
