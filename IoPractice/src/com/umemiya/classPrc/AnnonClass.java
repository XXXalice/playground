package com.umemiya.classPrc;

public class AnnonClass {
    public static void main(String[] args) {
        Pocket<Object> pocket = new Pocket<>();
        System.out.println("匿名の使い捨てクラス");
        pocket.setItem(new Object() {
            String innerField;
            void innerMethod() {
                System.out.println(innerField);
            }
        });
    }
}
