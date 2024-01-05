package com.example.kotlinleetcode.easy

fun main() {
   // println(buyChoco(intArrayOf(1,2,2),3))
    println(buyChoco(intArrayOf(3,2,3),3))
}

fun buyChoco(prices: IntArray, money: Int): Int {

    prices.sort()

    if (money >= prices[0] + prices[1]){
        return money - prices[0] - prices[1]
    }
    return money
}