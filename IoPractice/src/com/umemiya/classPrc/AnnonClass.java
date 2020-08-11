package com.umemiya.classPrc;

public class AnnonClass {
    public static void main(String[] args) {
        Pocket<Object> pocket = new Pocket<Object>();
        System.out.println("匿名の使い捨てクラス");
        // 匿名クラスは宣言と利用を同時に行う
        // new Object()は匿名クラスの親クラスを指定（クラス宣言とインスタンス化を同時に行うため命名する必要がない）
        pocket.setItem(new Object() {
            String innerField;
            void innerMethod() {
                System.out.println(innerField);
            }
        });
    }
}
