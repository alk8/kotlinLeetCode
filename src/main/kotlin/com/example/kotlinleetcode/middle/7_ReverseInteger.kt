package com.example.kotlinleetcode.middle

import kotlin.math.abs
import kotlin.math.pow

fun main() {
   //println(reverse(1534236469))
   println(reverse(1534236469))//
   // SOLVED
}

fun reverse(x: Int): Int {
    if (x == Int.MAX_VALUE || x == Int.MIN_VALUE) return 0
    var number = abs(x).toLong()
    val negative = if (x < 0) -1 else 1
    val size = number.toString().length
    var result = 0.0

    var s = 10.0.pow(size-1).toInt()
    var j = 1

    for (i in 1..size){
        val g = number / s
        number -=g * s
        result += g*j
        s /= 10
        j *= 10
    }

    if (result > Int.MAX_VALUE) return 0
    return (result * negative).toInt()
}