package com.company;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private static ArrayList<Animal> animals = new ArrayList<Animal>();
    private  ArrayList<Animal> d= new ArrayList<Animal>();
    private ArrayList<Accessories> acc= new ArrayList<Accessories>();

    public Aquarium(ArrayList<Animal> animals,ArrayList<Accessories> acc){
        this.animals=animals;
        this.acc=acc;
    }

    public void simulateAnimal(){
        int count=0;
        for(Animal f :animals) {
            System.out.println(f.foodType());
            System.out.println("the statement that "+f.getClass().getSimpleName()+" is having legs is "+ f.isLegs());
            count=count+1;
            if(count==2){
                break;
            }
        }

    }
    public int getAniSum(){
        int sum=0;
        for(Animal a: animals){
            sum+=a.getPrice();
        }
        return sum;
    }
    public int getAccSum(){
        int sum=0;
        for(Accessories a:acc){
            sum+=a.getPrice();
        }
        return sum;
    }

public void AccessInfo(){
        for(Accessories d: acc){
            System.out.println(d.use());
        }
}
 public int getTotalSum(){
        return getAccSum()+getAniSum();
 }


    public static void printAccessories(ArrayList<Accessories> allAccessories) {

        for (Accessories accessories : allAccessories) {
            System.out.println("Accessories : [ Price : " + accessories.getPrice() +  ", " +accessories.getClass().getSimpleName()+ " ]");
        }
    }

    public static void getInfo(){
        try{
            DbConAnimal cn = DbConAnimal.getInstance();
            Connection conn = cn.getConn();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from fishes");
            while (rs.next()) {
                Animal animal = new Fish(rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
                animals.add(animal);
            }
            ResultSet d = stmt.executeQuery("select * from reptiles");
            while (d.next()) {
                Animal a = new Reptiles(d.getInt(5), d.getString(4), d.getInt(2), d.getString(3));
                animals.add(a);
            }
            conn.close();
        } catch (Exception ex) {
            System.out.println("Connection failed");
            System.out.println(ex);
        }
    }
    public static void printAnimals(ArrayList<Animal> allAnimal) {

        for (Animal animal : allAnimal) {
            System.out.println("Animal : [ Price : " + animal.getPrice() + ", Gender : " + animal.getGender() +",age: "+ animal.getAge()+ ", the animal type : " +animal.getClass().getSimpleName()+ " ]");
        }
    }

}
