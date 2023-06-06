package com.example.kotlinleetcode.easy

fun main() {

    println()

}


fun climbStairs(n: Int): Int {

    var x = n
    // no have a staircase.
    if (n == 0) return 0
    // always we have minimum a one solution.
    var result = 1

    while (x/2 != 0){
        x /= 2
        result += x
    }
    return result * 2
}