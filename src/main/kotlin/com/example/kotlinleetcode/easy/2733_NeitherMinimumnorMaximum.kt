package com.example.kotlinleetcode.easy

fun main() {

}

fun findNonMinOrMax(nums: IntArray): Int {
    if (nums.size < 3) return -1
    nums.sort()
    return nums[1]
}
