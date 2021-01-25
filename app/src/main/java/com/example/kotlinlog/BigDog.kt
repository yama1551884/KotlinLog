package com.example.kotlinlog

import android.util.Log

class BigDog: Dog {

    constructor(name: String, age: Int): super(name, age) {
    }

    override fun say() {
        super.say()
        Log.d("Kotlintest", "好きな犬です。")
    }
}