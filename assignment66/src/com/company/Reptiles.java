package com.company;

public class Reptiles extends Animal {
 private String type;
 private String name;
    public Reptiles( int age, String gender, int price,String type) {
        super( age, gender, price);
        this.type=type;
    }

    @Override
    public String foodType() {
        return "The food for reptiles  is dozens";
    }

    @Override
    public boolean isLegs() {
        return true;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}
