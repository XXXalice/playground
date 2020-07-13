package com.umemiya.matcher;

import java.util.Arrays;
import java.util.List;

public class MatchesTest {

    /**
     * メアド正規表現（しょぼい）
     */
    private static final String MAIL_ADDRESS_PATTERN = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]+";

    /**
     * メイン関数
     *
     * @param args
     */
    public static void main(String[] args) {
        String address1 = "admin@unko.com";
        String address2 = "Ume3yA@umeume1234ume.jp";
        String validAddress1 = "noAddress@@@@";
        StringBuffer sb = new StringBuffer();
        String[] testAddresses = {address1, address2, validAddress1};
        for (String address : testAddresses) {
            if (validMailAddress(address)) {
                System.out.println(address + "はメアドと認識されました");
            } else {
                System.out.println(address + "は、メアドではありません");
            }
        }

        for (String target : new String[] {"akasatana", "あかさたな", "TANUKITAROU", "ToTaTotA"}) {
            List<String> result = tanukiString(target);
            System.out.println(result);
        }

    }

    /**
     * メアド調査
     * @param targetRegix 調査対象
     * @return boolean
     */
    public static boolean validMailAddress(String targetRegix) {
        return targetRegix.matches(MAIL_ADDRESS_PATTERN);
    }

    private static List<String> tanukiString(String target) {
        String tanukiRegix = "ta|た|TA|Ta";
        List<String> tanukiList = Arrays.asList(target.split(tanukiRegix, 0));
        return tanukiList;
    }
}
