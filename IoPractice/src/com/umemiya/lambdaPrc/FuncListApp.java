package com.umemiya.lambdaPrc;

public class FuncListApp {
    public static void main(String[] args) {
        FuncList funcList = new FuncList();
        Func1 f1 = FuncList::isOdd;
        // 非staticなのでインスタンスからじゃないと呼べない
        Func2 f2 = funcList::addNamePrefix;
        System.out.println(f1.call(3));
        System.out.println(f2.call(true, "umemiya"));
    }
}
