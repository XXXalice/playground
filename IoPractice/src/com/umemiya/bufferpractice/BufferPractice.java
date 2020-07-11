package com.umemiya.bufferpractice;

public class BufferPractice {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        String str = sb.append("こんにちは").append("私の").append("名前は").append("梅宮です").toString();
        System.out.println(str);

    }
}
