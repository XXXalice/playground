package com.umemiya.classPrc;

public class Outer {
    int outerField;

    /**
     * staticなフィールド
     */
    static int outerStaticField;

    static class Inner {
        void innerMethod() {
            outerStaticField = 10;
        }
    }
}
