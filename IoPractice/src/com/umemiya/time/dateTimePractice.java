package com.umemiya.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dateTimePractice {

    public static void main(String[] args) {
        //書式設定ができる
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate d = LocalDate.parse("20200726", f);
        System.out.println(d.format(f));
        System.out.println(LocalDate.now());
    }
}
