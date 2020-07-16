package com.umemiya.collectionprc;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPrc implements Fruits{

    private static Map<String, Integer> fruitsPriceList;

    public static void main(String[] args) {
        String[] fruits = {banana, apple, orange};
        int[] prices = {150, 100, 70};
        fruitsPriceList = new HashMap<>();
        for (int i = 0; i < fruits.length; i++) {
            fruitsPriceList.put(fruits[i], prices[i]);
        }
    }
}
