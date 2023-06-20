package com.example.kotlinleetcode.easy

import kotlin.math.abs

fun main() {
    println(convertToBase7(49))
}

fun convertToBase7(num: Int): String {
    var number = abs(num)

    if (number in 0..6) return num.toString()

    val str = StringBuilder()
    do {
        str.append(number % 7)
        number /= 7
    } while (number>=7)

    str.append(number)

    if (num < 0){
        str.append("-")
    }
    return str.reverse().toString()
}