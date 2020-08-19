package com.umemiya.lambdaPrc;

import java.util.function.IntToDoubleFunction;

public class LambdaOut {
    public static void main(String[] args) {
        double b = 3.14;

        IntToDoubleFunction getCircle = (x) -> {
            return x * x * b;
        };
    }
}
