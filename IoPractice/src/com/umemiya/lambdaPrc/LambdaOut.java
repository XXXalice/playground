package com.umemiya.lambdaPrc;

import java.util.function.IntToDoubleFunction;

public class LambdaOut {
    public static void main(String[] args) {
        // bは実質的にfinalな変数である必要がある
        // ラムダ内部で書き換えることができない
        double b = Math.PI;

        IntToDoubleFunction getCircle = (x) -> {
            return x * x * b;
        };
        System.out.println(getCircle.applyAsDouble(1));
    }
}
