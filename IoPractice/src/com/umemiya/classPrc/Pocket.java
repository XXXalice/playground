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
     * キー解除の必要カウント
     */
    private long needCount;
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
        if (keyType == KeyType.PADLOCK) this.needCount = PADLOCK_COUNT;
        if (keyType == KeyType.BUTTON) this.needCount = BUTTON;
        if (keyType == KeyType.DIAL) this.needCount = DIAL;
        if (keyType == KeyType.FINGER) this.needCount = FINGER;
    }

    public Pocket() {

    }

    public E getItem() {
        this.count++;
        if (isOpen(this.count)) {
            return this.item;
        } else {
            return null;
        }
    }

    public void setItem(E item) {
        this.item = item;
    }

    /**
     * 空いているか空いていないか
     *
     * @param count 試行回数
     * @return true: 空いた false: 空いてない
     */
    private boolean isOpen(long count) {
        return count >= this.needCount;
    }
}
