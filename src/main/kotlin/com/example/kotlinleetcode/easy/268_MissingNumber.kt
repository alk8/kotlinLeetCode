package com.example.kotlinleetcode.easy

fun main() {

    missingNumber(intArrayOf(3,0,1))

}

fun missingNumber(nums: IntArray): Int {

    //(1 + 100) * 100 / 2 all sum of number
    return ((1 + nums.size) * nums.size / 2) - nums.sum()

}