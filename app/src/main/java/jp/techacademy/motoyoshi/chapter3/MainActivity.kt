package jp.techacademy.motoyoshi.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // クラス
        val human = Human("AAA", 15)
        val hobby = "B"


        human.say()
        human.think()
    }
}