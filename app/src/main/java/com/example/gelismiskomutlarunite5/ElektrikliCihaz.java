package com.example.gelismiskomutlarunite5;

public class ElektrikliCihaz {
    String cihazAdi;
    int cihazGucuKw;
    int gunlukKullanim;
    public int AylikKullanim()
    {
        return  cihazGucuKw*gunlukKullanim*30;
    }
}
