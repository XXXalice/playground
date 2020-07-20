package com.umemiya.collectionprc;

import java.util.ArrayList;
import java.util.List;

class Animal {
    public String name;
    public int age;
}

public class Sansyo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "cat";
        animal.age = 10;

        List<Animal> animalList = new ArrayList<>();
        animalList.add(animal);
        animal.name = "alternative_cat";
        System.out.println(animalList.get(0).name);
    }
}
