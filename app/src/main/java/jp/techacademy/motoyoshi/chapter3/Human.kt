package jp.techacademy.motoyoshi.chapter3

import android.util.Log

open class Human: Animal, Thinkable {
    // 引数付きコンストラクタ
    constructor(name: String, age: Int): super(name, age) {
    }


    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "私の名前は"+this.name + "です。年は" + this.age + "歳です。")
    }

    override var hobby: String = ""

    override fun think() {
        Log.d("kotlintest", "私は"+this.hobby + "について考える。")
    }
}