package com.umemiya.jvmHandler;

public class Exit {
    public static void main(String[] args) {
        boolean a = false;
        if (!a) {
            System.out.println("正しくありません、終了します");
            System.exit(1);
        }
        System.out.println("正常に終了しました");
    }
}
