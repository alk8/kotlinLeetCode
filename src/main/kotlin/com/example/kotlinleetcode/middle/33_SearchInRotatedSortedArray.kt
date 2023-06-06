package com.example.kotlinleetcode.middle

fun main() {
    println(search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0))
    //SOLVED
}

fun search(nums: IntArray, target: Int): Int {

    var l = 0
    var r = nums.lastIndex
    var m: Int

    do {
        m = (l + r) / 2
        if (target == nums[m]) {
            return m
        } else {
            if (nums[l] <= nums[m]) {
                if (nums[l] <= target && target <= nums[m]) r = m - 1 else l = m + 1
            } else {
                if (nums[m] <= target && target <= nums[r]) l = m + 1 else r = m - 1
            }
        }
    } while (l <= r)
    return -1
}