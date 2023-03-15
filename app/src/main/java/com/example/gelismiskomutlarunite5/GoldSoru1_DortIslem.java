package com.example.gelismiskomutlarunite5;

public class GoldSoru1_DortIslem {
    public int sonuc;

    public GoldSoru1_DortIslem(int sayi1, int sayi2, String islem) {
        switch (islem) {
            case "+":
                this.sonuc = sayi1+sayi2;
                break;
            case "-":
                this.sonuc = sayi1-sayi2;
                break;
            case "/":
                this.sonuc = sayi1/sayi2;
                break;
            case "*":
                this.sonuc = sayi1*sayi2;
                break;
        }
    }
}
