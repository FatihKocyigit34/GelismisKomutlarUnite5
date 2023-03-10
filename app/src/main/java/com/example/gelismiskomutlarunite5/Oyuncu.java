package com.example.gelismiskomutlarunite5;

public class Oyuncu {
    Integer Can;
    String Isim;

    public Oyuncu(Integer can, String isim) {
        Can = can;
        Isim = isim;
    }

    public Integer getCan() {
        return Can;
    }

    public void setCan(Integer can) {
        Can = can;
    }

    public String getIsim() {
        return Isim;
    }

    public void setIsim(String isim) {
        Isim = isim;
    }

    public Asker tankci = new Tankci();
    public Asker topcu = new Topcu();

}
