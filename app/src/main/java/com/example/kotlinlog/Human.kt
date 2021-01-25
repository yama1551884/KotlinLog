package com.example.kotlinlog

import android.util.Log

class Human: Animal, Thinkable {

    var hobby: String

    constructor(name: String, age: Int, hobby: String) : super(name, age){
        this.hobby = hobby
    }

    override fun say() {
        Log.d("Kotlintest", "私の名前は" + this.name + "です。")
        Log.d("Kotlintest", "私の年齢は" + this.age + "です。")
    }


    override fun think() {
        Log.d("Kotlintest", "私は" + this.hobby + "について考える。")
    }
}