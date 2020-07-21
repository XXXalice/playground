package com.umemiya.collectionprc;

import java.util.HashMap;
import java.util.Map;

class Hero {
    String name;
    int level;

    public Hero(String name, int level) {
        this.name = name;
        this.level = level;
    }
}

public class Power {
    public static void main(String[] args) {
        Map<Hero, Integer> heroes = new HashMap<Hero, Integer>();
        Hero h1 = new Hero("taro", 1);
        Hero h2 = new Hero("jiro", 3);
        heroes.put(h1, 10);
        heroes.put(h2, 20);
    }
}
