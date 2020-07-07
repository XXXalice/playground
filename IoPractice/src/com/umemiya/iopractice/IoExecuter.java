package com.umemiya.iopractice;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IoExecuter {
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 商品の決済
     *
     * @return 商品と個数
     */
    public Map<String, Integer> paymentItems(List<String> order) {

    }

    /**
     * 合計金額の合算
     *
     * @return 合計金額
     */
    public int calcSumPrice() {

    }
}
