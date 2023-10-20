package com.example.kotlinleetcode.easy

fun main() {

   // println(arrangeCoins(5))
    println(arrangeCoins(1))

}

fun arrangeCoins(n: Int): Int {

    var step = 1
    var res = 0
    var num = n

    while (num - step >= 0){
        num -= step
        step++
        res++
    }

    return res

}