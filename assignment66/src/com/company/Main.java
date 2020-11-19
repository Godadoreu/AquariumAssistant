package com.company;
import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> allAnimal = new ArrayList<Animal>();
        ArrayList<Accessories> allAccessories = new ArrayList<Accessories>();
        Aquarium t = new Aquarium(allAnimal, allAccessories);
        t.getInfo();
        CriteriaAnimal male = new CriteriaMaleAnimal();
        CriteriaAnimal female = new CriteriaFemaleAnimal();
        System.out.println(" iIts an available animals in aquarium. We divide it according to the gender");
        System.out.println("Males: ");
        t.printAnimals(male.meetCriteria(allAnimal));
        System.out.println("\nFemales: ");
        t.printAnimals(female.meetCriteria(allAnimal));
        System.out.println("\nIt is the amount of money that you will pay for all animals: "+ t.getAniSum());
        System.out.println("\nThere is going to be some extra information about the animals in aquarium");
        t.simulateAnimal(); // info about Animal
        Scanner scan = new Scanner(System.in);
        System.out.println ("\nMoreover, you need to buy the grid for your aquarium");
        System.out.println ("Specify the length of grid");
        int length = scan.nextInt();
        System.out.println ("Specify the price for your grid");
        int price = scan.nextInt();
      Accessories grid=  new Grid(price,length);
        allAccessories.add(grid);
        System.out.println ("You need to buy the feed for your animals");
        System.out.println ("Specify the price of feed");
        int feedPrice = scan.nextInt();
        System.out.println ("Specify for whom you need to buy the feed");
        String feedName = scan.next();
        Accessories feed=  new Feed(feedPrice,feedName);
        allAccessories.add(feed);
        System.out.println("It is an available accessories in aquarium");
        t.printAccessories(allAccessories);
        System.out.println("It is the amount of money that you will pay for all accessories: "+ t.getAccSum());
        t.AccessInfo(); // info about Accessories
        System.out.println("\nIt is the amount of money that you will pay for everything in aquarium: "+ t.getTotalSum());
    }



}