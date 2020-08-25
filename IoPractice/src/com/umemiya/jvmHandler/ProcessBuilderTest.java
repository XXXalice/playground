package com.umemiya.jvmHandler;

public class ProcessBuilderTest {
    public static void main(String[] args) throws Exception{
        System.out.println("処理を開始します");


        System.out.println("処理が完了しました");
        try {
            ProcessBuilder pb = new ProcessBuilder(
                    "ls -la"
            );
            pb.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
