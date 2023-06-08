package com.example.kotlinleetcode.easy

fun main() {
    println( average(intArrayOf(4000,3000,1000,2000)))
}

fun average(salary: IntArray): Double {

    salary.sort()

    var r = 0.0

    for (i in 1 until salary.lastIndex) r += salary[i]

    return r / (salary.size - 2).toDouble()

}




