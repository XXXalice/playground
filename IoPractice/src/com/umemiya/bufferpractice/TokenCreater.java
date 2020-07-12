package com.umemiya.bufferpractice;

import java.util.List;
import java.util.Map;

public class TokenCreater {

    /**
     * ストリングバッファ
     */
    private static StringBuffer sb;

    /**
     * token格納マップ
     */
    private static Map<Integer, String> tokens;

    /**
     * メイン関数
     * @param args
     */
    public static void main(String[] args) {
        RandomWordMaker tokenizer = new RandomWordMaker(5);

        int[] range = new int[50];
        for (int iter: range) {
            sb.append(tokenizer.makeToken());
            tokens.put(iter, sb.toString());
            sb.setLength(0);
        }

    }
}
