package com.company;

import java.util.ArrayList;
public class CriteriaMaleAnimal implements CriteriaAnimal {
    @Override
    public ArrayList<Animal> meetCriteria(ArrayList<Animal> animals) {
        ArrayList<Animal> maleAnimal = new ArrayList<Animal>();
        for (Animal animal : animals) {
            if(animal.getGender().equalsIgnoreCase("male")){
                maleAnimal.add(animal);
            }
        }
        return maleAnimal;
    }
}
