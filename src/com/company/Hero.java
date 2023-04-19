package com.company;

public class Hero {
   private int supersposobnost ;
   private int uron;
   private int zrodovia;

    public Hero(int supersposobnost, int uron, int zrodovia) {
        this.supersposobnost = supersposobnost;
        this.uron = uron;
        this.zrodovia = zrodovia;
    }

    public Hero(int uron, int zrodovia) {
        this.uron = uron;
        this.zrodovia = zrodovia;
    }

    public int getSupersposobnost() {
        return supersposobnost;
    }

    public void setSupersposobnost(int supersposobnost) {
        this.supersposobnost = supersposobnost;
    }

    public int getUron() {
        return uron;
    }

    public void setUron(int uron) {
        this.uron = uron;
    }

    public int getZrodovia() {
        return zrodovia;
    }

    public void setZrodovia(int zrodovia) {
        this.zrodovia = zrodovia;
    }
}
