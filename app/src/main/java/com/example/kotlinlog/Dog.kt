package com.example.kotlinlog

import android.util.Log

open class Dog: Animal, Movable  {

    constructor(name: String, age: Int) : super(name, age){
    }

    override fun say() {
        Log.d("Kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    override fun move() {
        Log.d("Kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }

}