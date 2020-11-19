package com.company;

import java.util.ArrayList;

public class CriteriaFemaleAnimal implements CriteriaAnimal {
    @Override
    public ArrayList<Animal> meetCriteria(ArrayList<Animal> animals) {
        ArrayList<Animal> femaleAnimal = new ArrayList<Animal>();
        for (Animal animal : animals) {
            if(animal.getGender().equalsIgnoreCase("female")){
                femaleAnimal.add(animal);
            }
        }
        return femaleAnimal;
    }
}
