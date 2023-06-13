package com.example.kotlinleetcode.easy

fun main() {
    fib(2)
}

fun fib(n: Int): Int {

    if (n==0) return 0

    var previous = 0
    var num = 1

    for (i in 1 until n) num += previous.also { previous = num }
    return num

}