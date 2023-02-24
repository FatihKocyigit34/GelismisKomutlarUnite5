package com.example.gelismiskomutlarunite5;

public class Dikdortgen {
    public  int KisaKenar;
    public  int UzunKenar;

    public Dikdortgen(int kısaKenar, int uzunKenar) {
        KisaKenar = kısaKenar;
        UzunKenar = uzunKenar;
    }

    public Dikdortgen(int kısaKenar) {
        KisaKenar = kısaKenar;
        UzunKenar = kısaKenar;
    }

    public int alanbul () {
        Integer alan;
        alan = KisaKenar*UzunKenar;
        return alan;
    }
}
