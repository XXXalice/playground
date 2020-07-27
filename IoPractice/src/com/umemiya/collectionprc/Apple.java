package com.umemiya.collectionprc;

public class Apple implements Cloneable {
    private static String name;
    private static int id;

    public Apple clone(){
        Apple res = new Apple();
        res.name = this.name;
        res.id = this.id;
        return res;
    }
}
