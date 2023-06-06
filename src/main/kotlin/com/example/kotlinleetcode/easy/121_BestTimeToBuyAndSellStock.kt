package com.example.kotlinleetcode.easy

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 */

fun main() {
    // SOLVED
    println(maxProfit(intArrayOf(3, 2, 6, 5, 0, 3)))

}

fun maxProfit(prices: IntArray): Int {

    if (prices.size <= 1) {
        return 0
    }

    var left = 0
    var right = 1

    var result = 0
    while (right < prices.size) {
        val cur = prices[left] - prices[right]
        result = Integer.max(result, cur)
        if (cur < 0) {
            left = right
        }
        right++
    }
    return result
}

fun findMinElementArray(prices: IntArray): Int {

    var value: Int = Int.MAX_VALUE

    for (i in 0..prices.lastIndex) {
        if (value > prices[i]) {
            value = prices[i]
        }
    }
    return value
}

fun findMaxElementArray(prices: IntArray): Int {

    var value: Int = Int.MIN_VALUE

    for (i in 0..prices.lastIndex) {
        if (value < prices[i]) {
            value = prices[i]
        }
    }
    return value
}
