package com.umemiya.collectionprc;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class iterPrc {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("banana", "apple", "orange");
        // イテレータの生成
        Iterator<String> it = items.iterator();
        while(it.hasNext()) {
            String item = it.next();
            System.out.println(item);
        }
    }
}
