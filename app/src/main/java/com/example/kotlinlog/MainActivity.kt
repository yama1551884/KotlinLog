package com.example.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("山本",25,"サッカー")
        human.say()
        human.think()

        val human2 = Human("裕貴",25,"野球")
        human2.say()
        human2.think()
    }
}