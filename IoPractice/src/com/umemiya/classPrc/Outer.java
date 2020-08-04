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

        void innerMethod2() {
            System.out.println("konbanha");
            System.out.println(outerStaticField);
        }
    }
    void outerMethod() {
        Inner ic = new Inner();
    }

    public static int getOuterStaticField() {
        return outerStaticField;
    }
}

class Main {
    public static void main(String[] args) {
        Outer.Inner ic = new Outer.Inner();
        ic.innerMethod();
        ic.innerMethod2();
    }
}
