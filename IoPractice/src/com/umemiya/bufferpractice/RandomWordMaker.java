package com.umemiya.bufferpractice;

import java.util.Random;

/**
 * todo: コンストラクタから文字数を変更できるようにしたい
 * ランダムなトークン文字列（数値のみ）を生成するクラス
 *
 * @author umemiya
 */
public class RandomWordMaker {

    /**
     * 文字数
     */
    private static int tokenLength;

    /**
     * nextInt()で使用する乱数範囲（必ず1桁になる）
     */
    private static final int MAKE_RANGE = 10;

    /**
     * 5文字固定
     * メモリ領域確保
     */
    private static String[] wordMem = new String[tokenLength];

    /**
     * ========コンストラクタ========
     * todo:　上に則る
     *
     * @param tokenLength
     */
    public RandomWordMaker(int tokenLength) {
        this.tokenLength = tokenLength;
    }

    /**
     * static
     *
     * token生成メソッド
     *
     *
     * @return token文字列
     */
    static String makeToken() {
        Random rnd = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < wordMem.length; i++) {
            sb.append(rnd.nextInt(MAKE_RANGE));
        }
        return sb.toString();
    }

}
