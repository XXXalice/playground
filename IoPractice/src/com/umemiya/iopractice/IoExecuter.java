package com.umemiya.iopractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class IoExecuter {

    /**
     * 商品一覧
     */
    private static Map<String, Integer> itemList;

    /**
     * メイン関数
     *
     * @param args
     */
    public static void main(String[] args) {
        String CSV_PATH = "csv";
        try {
            File f = new File(CSV_PATH + "/" + "test1.csv");
            BufferedReader br = new BufferedReader(new FileReader(f));

            String line;
            Map<String, Integer> frults = new HashMap<>();
            while((line = br.readLine()) != null) {
                String[] data = line.split(",", 0);
                frults.put(data[0], Integer.valueOf(data[1].trim()));
            }
            itemList = frults;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 商品の決済
     *
     * @param order 商品購入リスト
     * @return 商品と個数
     */
    public Map<String, Integer> paymentItems(String order) {
        String[] items = order.split(" ", 0);
        int count = 0;
        Map<String, Integer> buyList = new HashMap<>();
        for (String item: items) {
            buyList.put(item, count);
        }

        for (String item: items) {
            // 商品一覧に購入商品が含まれているか
            if (itemList.containsKey(item)) {
                buyList.replace(item, count++);
            }
        }
        return buyList;
    }

    /**
     * 合計金額の合算
     *
     * @return 合計金額
     */
    public int calcSumPrice() {

    }
}
