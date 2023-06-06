package com.example.kotlinleetcode.hard
import kotlin.math.round

fun main() {}

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    // SOLVED
    val nums = nums1 + nums2;
    nums.sort()
    if (nums.size % 2 == 0) {
        val half = (nums.size / 2) - 1
        return ((nums[half] + nums[half + 1]).toDouble() / 2)
    } else {
        return nums[round((nums.size / 2).toDouble()).toInt()].toDouble()
    }
}
