package com.umemiya.lambdaPrc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamPrc {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1, 2, 3);
        List<Integer> numList2 = new ArrayList<>();
        for (Integer i : numList) {
            numList2.add(i * 2);
        }
        numList2.forEach(i -> {
            System.out.println(i);
        });

        List<Character> charList = new ArrayList<>(Arrays.asList('a', 'b', 'c'));
        charList.stream()
                .map(character -> character.equals('a') ? 'o' : 'x')
                .forEach(character -> System.out.println(character));
    }
}
