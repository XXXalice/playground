package com.umemiya.lambdaPrc;

import java.util.function.IntToDoubleFunction;

public class Lambda {
    public static void main(String[] args) {
        IntToDoubleFunction func = (int x) -> {
            return x * x * 3.14;
        };

        func = (x) -> {
            return x * x * 3.14;
        };

        func = x -> {
            return x * x * 3.14;
        };

        func = x -> x * x * 3.14;

        System.out.println(func.applyAsDouble(3));
    }
}
