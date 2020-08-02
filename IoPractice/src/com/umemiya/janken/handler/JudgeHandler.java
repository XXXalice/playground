package com.umemiya.janken.handler;

import com.umemiya.janken.Hands;
import static com.umemiya.janken.Hands.*;

public class JudgeHandler {

    /**
     * 勝敗ジャッジを行う
     *
     * @param pHand プレイヤーの手
     * @param cHand 相手の手
     * @return int -1: lose 0: draw 1: win
     */
    public int judge(Hands pHand, Hands cHand) {
        if (pHand == ROCK) {
            if (cHand == ROCK) return 0;
            if (cHand == PAPER) return -1;
            if (cHand == SCISSORS) return 1;
        } else if (pHand == PAPER) {
            if (cHand == ROCK) return 1;
            if (cHand == PAPER) return 0;
            if (cHand == SCISSORS) return -1;
        } else if (pHand == SCISSORS) {
            if (cHand == ROCK) return -1;
            if (cHand == PAPER) return 1;
            if (cHand == SCISSORS) return 0;
        }
        return 0;
    }

    public void calcJudge(int judge) {
        if (judge == 0) System.out.println("あいこ");
        if (judge > 0) System.out.println("かち");
        if (judge < 0) System.out.println("まけ");
    }

}
