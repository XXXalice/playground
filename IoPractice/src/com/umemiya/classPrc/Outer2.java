package com.umemiya.classPrc;

public class Outer2 {
    // 非finalメンバ
    int outerMember;
    void outerMethod() {
        // 非finalローカル変数
        int a = 10;

        /**
         * ローカルクラスの内部からouterMemberは利用できるが変数aは利用できない
         */
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
