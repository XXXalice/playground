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
        // コピーしているわけではなく、animalのポインタが格納される
        animalList.add(animal);
        // 同一の参照
        animal.name = "alternative_cat";

        // 同一の参照
        System.out.println(animalList.get(0).name);
    }
}
