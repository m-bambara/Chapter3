package jp.techacademy.motoyoshi.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // クラス
        val human = Human("AAA", 15, "BBB")


        human.say()
        human.think()
    }
}