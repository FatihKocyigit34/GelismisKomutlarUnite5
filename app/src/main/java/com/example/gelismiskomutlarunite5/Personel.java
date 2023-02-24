package com.example.gelismiskomutlarunite5;

import android.util.Log;

public class Personel {
    public int getYas() {
        return yas;
    }

    private int yas;
    public void setYas(int yas) {
        if(yas<18 || yas>55){
            Log.e("Kapsülleme", "Hatalı yaş");
            yas = 18;
        }
        this.yas = yas;
    }
}
