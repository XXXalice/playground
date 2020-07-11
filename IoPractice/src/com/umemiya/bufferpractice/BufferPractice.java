package com.umemiya.bufferpractice;

public class BufferPractice {

    /**
     * 連結テスト
     */
    private static StringBuffer superStr = new StringBuffer();

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        String str = sb.append("こんにちは").append("私の").append("名前は").append("梅宮です").toString();
        System.out.println(str);

        String str2 = sb.append("a").toString();
        System.out.println(str2);

    }

}
