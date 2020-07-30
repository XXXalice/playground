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
    private int judge(Hands pHand, Hands cHand) {
        if (pHand == ROCK) {
            if (cHand == ROCK) return 0;
            if (cHand == PAPER) return -1;
            if (cHand == SCISSORS) return 1;
        } else if (pHand == PAPER) {

        } else if (pHand == SCISSORS) {

        }
        return 0;
    }
}
