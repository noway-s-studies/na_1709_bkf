package eu.artouch.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

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
    }
}
