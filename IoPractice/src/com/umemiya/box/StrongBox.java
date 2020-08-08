package com.umemiya.box;

/**
 * 型指定なしの金庫クラス
 * アイテムを1つのみ格納可能
 *
 * @param <E>
 */
public class StrongBox<E> {
    private E item;

    public E get() {
        return item;
    }

    public void put(E item) {
        this.item = item;
    }
}
