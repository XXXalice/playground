package com.umemiya.jvmHandler;

public class Exit {
    public static void main(String[] args) {
        boolean a = false;
        if (!a) {
            System.out.println("正しくありません、終了します");
            // 0: 正常終了
            // それ以外: 以上終了
            System.exit(1);
        }
        System.out.println("正常に終了しました");
    }
}
