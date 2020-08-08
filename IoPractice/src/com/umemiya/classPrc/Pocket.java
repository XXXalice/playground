package com.umemiya.classPrc;

import com.umemiya.box.KeyType;

public class Pocket<E> {
    /**
     * その他の型
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

    private final long PADLOCK_COUNT = 1024;
    private final long BUTTON = 10000;
    private final long DIAL = 30000;
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
