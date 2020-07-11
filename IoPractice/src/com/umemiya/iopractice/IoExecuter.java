package com.umemiya.iopractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * csvの商品価格表を読み取って読み取って標準入力で注文し会計するアプリケーション
 *
 * @author umemiya
 */
public class IoExecuter {

    /**
     * 商品一覧
     */
    private static Map<String, Integer> itemList;

    /**
     * 合計金額
     */
    private static int sumPrice;

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
            Map<String, Integer> fruits = new HashMap<>();
            while((line = br.readLine()) != null) {
                String[] data = line.split(",", 0);
                fruits.put(data[0], Integer.valueOf(data[1].trim()));
            }
            itemList = fruits;
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("購入商品を入力してください：");
        String order = scanner.nextLine();
        scanner.close();

        if (executePay(order)) {
            System.out.println("合計金額は" + sumPrice);
        } else {
            System.out.println("お会計に失敗しました");
        }
    }

    /**
     * 決済の実行メソッド
     *
     * @param order
     * @return 決済成功or失敗
     */
    private static boolean executePay(String order) {
        try {
            Map<String, Integer> buyList = paymentItems(order);
            sumPrice = calcSumPrice(buyList);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 商品の決済
     *
     * @param order 商品購入リスト
     * @return 商品と個数
     */
    private static Map<String, Integer> paymentItems(String order) {
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
     * @param buyList
     * @return 合計金額
     */
    private static int calcSumPrice(Map<String, Integer> buyList) {
        int sumPrice = 0;
        int itemNum;
        for (String buyItem: buyList.keySet()) {
            itemNum = buyList.get(buyItem);
            sumPrice += itemList.get(buyItem) * itemNum;
        }
        return sumPrice;
    }
}
