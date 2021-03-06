package com.umemiya.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dateTimePractice {

    public static void main(String[] args) {
        //書式設定ができる
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyyMMdd");
        //parse()でLocalDateに描画させる
        LocalDate d = LocalDate.parse("20200726", f);
        System.out.println(d.format(f));
        //now()で現在の年、月、日がわかる
        System.out.println(LocalDate.now());
        LocalDate d2 = LocalDate.parse(LocalDate.now().toString(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
