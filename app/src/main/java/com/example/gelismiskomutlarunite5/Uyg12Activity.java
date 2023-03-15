package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Uyg12Activity extends AppCompatActivity {
    Button btnEkle;
    ListView listAdlar;
    EditText editTxtAdlar;
    ArrayList<String> adListesi = new ArrayList<>();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg12_activity);

        btnEkle = findViewById(R.id.btnEkle_Uyg12);
        editTxtAdlar = findViewById(R.id.editTxtAdlar);
        listAdlar = findViewById(R.id.listeAdlar);

        adapter = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, adListesi);
        listAdlar.setAdapter(adapter);

        listAdlar.setOnItemClickListener((adapterView, view, i, l) -> {
            adListesi.remove(i);
            adapter.notifyDataSetChanged();
        });
    }
    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg12Activity.this, MainActivity.class);
        startActivity(uyg);
    }

    public void btnEkle(View view) {
        String ad = editTxtAdlar.getText().toString();
        adListesi.add(ad);
        adapter.notifyDataSetChanged();
        editTxtAdlar.getText().clear();
    }
}
