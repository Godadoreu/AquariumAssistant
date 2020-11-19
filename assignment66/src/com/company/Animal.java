package com.company;
 abstract public class Animal implements specificationAnimals{
    private int age;
    private String gender;
    private int id;
    private static int genId=0;
    private int price;
     public Animal( int age,String gender,int price) {
         this.id=genId++;
         this.age=age;
         this.gender=gender;
         this.price=price;
     }

     public int getPrice() {
         return price;
     }

     public void setPrice(int price) {
         this.price = price;
     }


     public String getGender() {
         return gender;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }


     public void setGender(String gender) {
         this.gender = gender;
     }

 }
