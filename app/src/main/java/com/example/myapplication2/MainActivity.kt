package com.example.myapplication2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val dog = Dog("ポチ", 3)

        dog.say()
        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")

        dog.move()

        val dog2 = Dog("ハチ", 10)
        dog2.say()
        Log.d("kotlintest", "犬の名前は" + dog2.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + dog2.age + "歳です。")

        val bigdog = BigDog("ヨーゼフ", 15)

        bigdog.say()
        Log.d("kotlintest", "犬の名前は"+ bigdog.name + "です")
        Log.d("kotlintest", "犬の年齢は"+ bigdog.age + "歳です")


        val human1 = Human("たかし", 37 , "読書")
        human1.say()
        human1.think()

        val human2 = Human("りょうた", 2, "トーマス")
        human2.say()
        human2.think()







    }
}