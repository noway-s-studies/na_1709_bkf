package eu.artouch.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    data class Ship(val name: String, val age: Int)

    interface Pressable {
        fun press()
    }
    class MyButton(val x: Int) : Pressable {
        override fun press() { Log.d("MyKotlinLOG", "press $x") }
    }

    class SpecialButton(pressable: Pressable) : Pressable by pressable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var score = 1
        val scoreText = "$score pont"
        Log.d("MyKotlinLOG", scoreText)

        score = 2
        val scoreNewText = "${scoreText.replace("pont", "volt, most: ")} $score"
        Log.d("MyKotlinLOG", scoreNewText)

        val car = Car("Trabant", "A4")


        val discovery = Ship("Discovery", 31)
        val (name, age) = discovery


        val btn = MyButton(10)
        SpecialButton(btn).press() // press 10

        val x = 4
        val y = 3
        if (x in 1..y+1) {
            Log.d("MyKotlinLOG", "x benne van")
        }

        for (nr in 1..10 step 2) {
            Log.d("MyKotlinLOG", "szam $nr")
        }

        val fruits = listOf("alma", "mango", "mandarin", "narancs")
        fruits.filter { it.startsWith("m") }
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach { Log.d("MyKotlinLOG", "$it") }

    }
}
