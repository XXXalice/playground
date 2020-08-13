package com.umemiya.lambdaPrc;

import java.util.function.IntBinaryOperator;

public class Inner2 {
    public static void main(String[] args) {
        // 2つの引数のさを求める処理の実態を生み出し、代入する
        IntBinaryOperator func = (int a, int b) -> { return a - b; };
        int a = func.applyAsInt(5, 3);
        System.out.println(a);
    }
}
