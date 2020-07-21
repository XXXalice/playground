package com.umemiya.collectionprc;

/**
 * 自作クラスの等価比較
 */
public class Account {
    public static void main(String[] args) {
        String accountNo;
    }

    @Override
    public boolean equals(Object obj) {
        // 自身が引数として渡されて来た場合、無条件でtrueを返す
        if (obj == this) return true;
        // nullが引数として渡されて来た場合、無条件でfalseを返す
        if (obj == null) return false;
        return false;
    }
}
