package com.umemiya.iopractice;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IoPractice {
    public static void main(String[] args) {
        String CSV_DIR = "csv";
        try {
            File f = new File(CSV_DIR);
            BufferedReader br = new BufferedReader(new FileReader(f));
            System.out.println("ok");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
