package com.example.kotlinleetcode.easy

import kotlin.math.abs
import kotlin.math.roundToInt


fun main() {

    println(mySqrt(8))
    println(mySqrt(4))
    println(mySqrt(3))

}

fun mySqrt(x: Int): Int {

    if (x == 0) return 0
    val eps = 0.00001

    var height = 1.0
    var width = x.toDouble()

    while (abs(width - height) > eps) {
        height = (height + width) / 2
        width = (x / height)
    }

    return height.toInt()

}



