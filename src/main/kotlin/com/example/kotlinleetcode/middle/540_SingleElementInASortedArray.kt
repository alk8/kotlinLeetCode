package com.example.kotlinleetcode.middle

fun main() {
    // SOLVED
}

fun singleNonDuplicate(nums: IntArray): Int {

    val size = nums.size
    if (size == 1) return nums[0]

    for(i in nums.indices){
        if (i % 2 != 0) continue
        val index = i + 1
        if (size <= index) return nums[i]
        if (nums[i] != nums[index]) return nums[i]
    }
    return 0
}