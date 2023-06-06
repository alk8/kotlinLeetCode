package com.example.kotlinleetcode.easy

fun main() {
    // SOLVED
}

fun searchInsert(nums: IntArray, target: Int): Int {

    if (nums.contains(target)) return nums.indexOf(target)

    val count = nums.size-1
    for (i in 0..count) {
        if (i == count) break
        if (target > nums[i] && target < nums[i + 1]) return i + 1
    }

    if (target> nums[count]) return nums.size
    return 0
}