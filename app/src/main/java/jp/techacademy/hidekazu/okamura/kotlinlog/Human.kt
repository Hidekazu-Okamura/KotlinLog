package jp.techacademy.hidekazu.okamura.kotlinlog

import android.util.Log
import kotlin.math.hypot

class Human: Animal,Thinkable {
    var hobby: String
    constructor(name: String, age: Int,h: String): super(name,age) {
        this.hobby = h
    }

    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }

    override fun think() {
        Log.d("kotlintest", "私は" + this.hobby + "について考える")
    }
}