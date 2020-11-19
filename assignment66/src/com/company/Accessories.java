package com.company;

abstract public class Accessories implements specificationAccessories {
    private int price;
    private int id;
    private static int genId=0;
    public Accessories(int price){
        this.id=genId++;
        this.price=price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Accessories{" +

                ", price=" + price +
                ", id=" + id +
                '}';
    }


}
