package jp.techacademy.motoyoshi.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val human = Human("AAA", 15, "BBB")

        human.say()
        human.think()

        val hanako = Human("Hanakko",20, "reading")
        hanako.say()
        hanako.think()
    }
}