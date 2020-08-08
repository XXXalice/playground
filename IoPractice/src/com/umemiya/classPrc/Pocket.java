package com.umemiya.classPrc;

import com.umemiya.box.KeyType;

public class Pocket<E> {
    /**
     * 金庫に格納するアイテム
     */
    private E item;
    /**
     * キータイプ
     */
    private KeyType keyType;
    /**
     * キー解除のカウント
     */
    private long count = 0;

    /**
     * 南京錠
     */
    private final long PADLOCK_COUNT = 1024;

    /**
     * 押しボタン式
     */
    private final long BUTTON = 10000;

    /**
     * ダイヤル式
     */
    private final long DIAL = 30000;

    /**
     * 指紋認証
     */
    private final long FINGER = 1000000;


    public Pocket(KeyType keyType) {
        this.keyType = keyType;
    }

    public E getItem() {
        this.count++;
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }
}
