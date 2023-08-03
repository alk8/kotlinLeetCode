package com.example.kotlinleetcode.easy

import kotlin.math.log2

fun main() {

    println(isPowerOfTwo(2097151))

}

fun isPowerOfTwo(n: Int): Boolean {

    return log2(n.toDouble()/2).toString().split(".")[1] == "0"

}