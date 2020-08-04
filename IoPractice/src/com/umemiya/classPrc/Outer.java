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
    void outerMethod() {
        Inner ic = new Inner();
    }
}

class Main {
    public static void main(String[] args) {
        Outer.Inner ic = new Outer.Inner();
        ic.innerMethod();
        Outer.outerMethod();
    }
}
