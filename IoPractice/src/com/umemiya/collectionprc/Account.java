package com.umemiya.collectionprc;

/**
 * 自作クラスの等価比較
 *
 */
public class Account implements Comparable<Account> {
    String accountNo;
    int number;

    @Override
    public boolean equals(Object obj) {
        // 自身が引数として渡されて来た場合、無条件でtrueを返す
        if (obj == this) return true;
        // nullが引数として渡されて来た場合、無条件でfalseを返す
        if (obj == null) return false;
        // 引数を比較し、型が異なるのであれば、falseを返す
        if (!(obj instanceof Account)) return false;
        Account receiver = (Account) obj;
        if (!this.accountNo.trim().equals(receiver.accountNo.trim())) {
            return false;
        }
        return true;
    }

    public int compareTo(Account obj) {
        if (this.number < obj.number) {
            return -1;
        } else {
            return 1;
        }
        // return 0;
    }
}
