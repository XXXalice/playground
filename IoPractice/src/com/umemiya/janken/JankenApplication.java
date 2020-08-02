package com.umemiya.janken;

import com.umemiya.janken.handler.JudgeHandler;

// import static宣言
import static com.umemiya.janken.Hands.*;

public class JankenApplication {

    public static void main(String[] args) {
        JudgeHandler judgeHandler = new JudgeHandler();
        int result = 0;
        Hands pHands = PAPER;
        Hands cHands = ROCK;
        result = judgeHandler.judge(pHands, cHands);
        judgeHandler.calcJudge(result);
    }
}
