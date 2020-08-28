package com.umemiya.jvmHandler;

import java.util.Iterator;
import java.util.Properties;

public class PropertyPrc {
    public static void main(String[] args) {
        System.out.println("javaのばーじょん！！");
        System.out.println(System.getProperty("java.version"));

        // getPropertiesでMap型のプロパティ一覧が取れる
        Properties p = System.getProperties();
        Iterator<String> i = p.stringPropertyNames().iterator();
        System.out.println("プロパティ一覧");
        while(i.hasNext()) {
            String key = i.next();
            System.out.print(key + " = ");
            System.out.println(System.getProperty(key));
        }
    }
}
