package com.umemiya.classPrc;

public class AnnonClass {
    public static void main(String[] args) {
        Pocket<Object> pocket = new Pocket<>();
        System.out.println("匿名の使い捨てクラス");
        // 匿名クラスは宣言と利用を同時に行う
        pocket.setItem(new Object() {
            String innerField;
            void innerMethod() {
                System.out.println(innerField);
            }
        });
    }
}
