package com.umemiya.collectionprc;

/**
 * 自作クラスの等価比較
 *
 * 自然順序づけをするにはComparable<T>を実装する
 * compareToメソッドを入れると自然順序をJVMに命令できる
 * TreeSetのような順番を入れ替えながら要素を格納するコレクション型であるため
 * 入れるオブジェクトのComparableが適切に実装されているかが大切
 */
public class Account implements Comparable<Account> {
    String accountNo;
    int number;

    /**
     * equalsのOverride
     *
     * @param obj
     * @return
     */
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

    /**
     * 自然順序づけ
     *
     * @param obj
     * @return
     */
    public int compareTo(Account obj) {
        // 自身よりobj（引数）の方が大き場合：負数
        if (this.number < obj.number) {
            return -1;
        }
        // 自身の方がobj（引数）より小さい場合：整数
        if (this.number > obj.number) {
            return 1;
        }
        // 同等の場合：0
        return 0;
    }
}
