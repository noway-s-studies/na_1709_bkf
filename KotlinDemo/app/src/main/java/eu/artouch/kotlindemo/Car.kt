package eu.artouch.kotlindemo

import android.util.Log

class Car constructor(type:String) {
    val typeUpper = type.toUpperCase()
    init {
        Log.d("MyKotlinLOG", "Car created: $type")
    }
    constructor(type: String, modell: String):this(type){
        Log.d("MyKotlinLOG", "Car model: $modell")
    }
}