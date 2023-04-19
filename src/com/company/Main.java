package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Boss boss = new Boss(550, 560, 570);
        System.out.println("Zdorovia: " + boss.getZdorovia_b() + " Uron: " + boss.getUron_b() +
                " Zashita: " + boss.getZashita_b());



    }

    public void createHeroes() {

        Hero hero1 = new Hero(150, 250, 200);
        Hero hero2 = new Hero(200, 300);
        Hero hero3 = new Hero(100, 200, 400);


    }
}