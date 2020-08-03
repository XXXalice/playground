package com.umemiya.janken;

import com.umemiya.janken.handler.JudgeHandler;

// import static宣言
import static com.umemiya.janken.Hands.*;

public class JankenApplication {

    public static void main(String[] args) {
        JudgeHandler judgeHandler = new JudgeHandler();
        Hands pHands = PAPER;
        Hands cHands = ROCK;
        int result = judgeHandler.judge(pHands, cHands);
        judgeHandler.calcJudge(result);
    }
}
