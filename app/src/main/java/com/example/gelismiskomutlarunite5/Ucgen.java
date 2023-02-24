package com.example.gelismiskomutlarunite5;

public class Ucgen {
    public int kenar1;
    public int kenar2;
    public int kenar3;

    public Ucgen(int kenar1, int kenar2, int kenar3) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.kenar3 = kenar3;
    }

    public Ucgen(int kenar1, int kenar2) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar1;
        this.kenar3 = kenar2;
    }

    public Ucgen(int kenar1) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar1;
        this.kenar3 = kenar1;

    }

    public int cevrebul () {
        int cevre;
        cevre = kenar1 + kenar2 + kenar3;
        return cevre;
    }
}
