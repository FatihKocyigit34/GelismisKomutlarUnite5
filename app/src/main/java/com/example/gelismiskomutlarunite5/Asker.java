package com.example.gelismiskomutlarunite5;

import java.util.Random;

public class Asker {

    public Integer getAtesGucu() {
        return atesGucu;
    }

    public void setAtesGucu(Integer atesGucu) {
        this.atesGucu = atesGucu;
    }

    public Asker(Integer atesGucu, Integer sans) {
        this.atesGucu = atesGucu;
        this.sans = sans;
    }

    public Integer getSans() {
        return sans;
    }

    public void setSans(Integer sans) {
        this.sans = sans;
    }
    public Integer atesGucu;
    public Integer sans;

    public Integer atesEt (Oyuncu dusman)
    {
        Random random = new Random ();
        int isabet = random.nextInt(sans) * atesGucu;
        dusman.setCan(dusman.getCan()-isabet);
        return isabet;
    }

}
