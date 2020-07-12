package com.umemiya.bufferpractice;

import java.util.HashMap;
import java.util.Map;

public class TokenCreater {

    /**
     * ストリングバッファ
     */
    private static StringBuffer tokenSb = new StringBuffer();

    /**
     * token格納マップ
     */
    private static Map<Integer, String> tokens = new HashMap<>();

    /**
     * tokenizer
     */
    private static RandomWordMaker tokenizer = new RandomWordMaker(5);


    /**
     * メイン関数
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] range = new int[10];
        for (int idx = 0; idx < range.length; idx++) {
            tokenSb.append(tokenizer.makeToken());
            tokens.put(idx, tokenSb.toString());
            tokenSb.setLength(0);
        }

        System.out.println(tokens);
    }
}
