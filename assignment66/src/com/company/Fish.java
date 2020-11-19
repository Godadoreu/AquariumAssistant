package com.company;

import java.util.ArrayList;

public class Fish extends Animal {
   private int fin;
private String name;
    public Fish( int age, String gender, int price, int fin) {
        super(age, gender, price);
        this.fin=fin;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }
    @Override
    public String foodType() {
        return "food for fish is the feed";
    }

    @Override
    public boolean isLegs() {
        return false;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }


}
