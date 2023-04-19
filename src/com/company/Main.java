package com.company;

public class Main {

    public static void main(String[] args) {


        Boss boss = new Boss(550, 560, 570);

        System.out.println("Zdorovia: " + boss.getZdorovia_b() + " Uron: " + boss.getUron_b() +
                " Zashita: " + boss.getZashita_b());

        CreateHeroes();
        for (int i = 0; i < CreateHeroes().length; i++) {
            System.out.println("Supersposobnoct: " + CreateHeroes()[i].getSupersposobnost());
            System.out.println("Uron: " + CreateHeroes()[i].getUron());
            System.out.println("zdorovia: " + CreateHeroes()[i].getZrodovia());
            System.out.println();
        }
    }
    public static Hero [] CreateHeroes() {

        Hero hero1 = new Hero(150, 250, 200);
        Hero hero2 = new Hero(200, 300);
        Hero hero3 = new Hero(100, 200, 400);

        Hero allHeroes []=new Hero[]{hero1,hero2,hero3};
        return allHeroes;


    }
}