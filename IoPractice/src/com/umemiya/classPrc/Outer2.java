package com.umemiya.classPrc;

public class Outer2 {
    // 非finalメンバ
    int outerMember;
    void outerMethod() {
        // 非finalローカル変数
        int a = 10;
        class Inner {
            public void innerMethod() {
                System.out.println("innerMethodです");
                System.out.println(outerMember);
            }
        }
        Inner ic = new Inner();
        ic.innerMethod();
    }
}
