package com.umemiya.lambdaPrc;

/**
 * MyFuncのinnerクラス
 */
public class Inner {
    public static int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        // SAMインタフェース 名前 = クラス名::静的メソッド名
        MyFunc func = Inner::sub;
        int a = func.call(5, 3);
        System.out.println(a);
    }
}
