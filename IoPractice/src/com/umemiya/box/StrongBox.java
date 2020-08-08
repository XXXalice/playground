package com.umemiya.box;

/**
 * 型指定なしの金庫クラス
 * アイテムを1つのみ格納可能
 *
 * @param <E>
 */
public class StrongBox<E> {
    private E item;

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }
}
