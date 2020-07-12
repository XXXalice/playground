package com.umemiya.bufferpractice;

import java.util.Random;

/**
 * ランダムなトークン文字列（数値のみ）を生成するクラス
 *
 * @author umemiya
 */
public class RandomWordMaker {



    /**
     * nextInt()で使用する乱数範囲（必ず1桁になる）
     */
    private static final int MAKE_RANGE = 10;

    /**
     * メモリ領域確保
     */
    private static String[] wordMem;

    /**
     * ========コンストラクタ========
     *
     * @param tokenLength tokenの長さ
     */
    public RandomWordMaker(int tokenLength) {
        wordMem = new String[tokenLength];
    }

    /**
     * static
     *
     * token生成メソッド
     *
     *
     * @return token文字列
     */
    public String makeToken() {
        Random rnd = new Random();
        StringBuffer sb = new StringBuffer();
        int rndNum;
        for (int i = 0; i < wordMem.length; i++) {
            rndNum = rnd.nextInt(MAKE_RANGE);
            sb.append(rndNum);
        }
        String token = sb.toString();
        return token;
    }


}
