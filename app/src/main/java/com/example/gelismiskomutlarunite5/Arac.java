package com.example.gelismiskomutlarunite5;

public class Arac {
    public Integer getAracKapiSayisi() {
        return AracKapiSayisi;
    }

    public void setAracKapiSayisi(Integer aracKapiSayisi) {
        AracKapiSayisi = aracKapiSayisi;
    }

    public Integer getAracMaksimumHiz() {
        return AracMaksimumHiz;
    }

    public void setAracMaksimumHiz(Integer aracMaksimumHiz) {
        AracMaksimumHiz = aracMaksimumHiz;
    }


    public Integer AracKapiSayisi;
    public Integer AracMaksimumHiz;

    public String AracKapiSayisii()
    {
        return "Aracın Kapı Sayısı: " + this.AracKapiSayisi.toString();
    }
    public String AracMaksimumHizz()
    {
        return "Aracın Maksimum Hızı: " + this.AracMaksimumHiz.toString();
    }

    public String calistir()
    {
        return "Araç Çalıştırılıyor.....";
    }



}
