package com.umemiya.lambdaPrc;

import java.util.function.IntBinaryOperator;

/**
 * 関数を代入する
 */
public class FuncInVariable {

    /**
     * 引数を2つ受け取り差を求める関数
     * @param a
     * @param b
     * @return
     */
    public static int sub(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        // 代入を行なっている
        // 実態はメソッドが入っているわけではなくsub()メソッドのメモリ番地が代入されている
        IntBinaryOperator func = FuncInVariable::sub;
        int a = func.applyAsInt(5, 3);
        System.out.println(a);
    }
}
