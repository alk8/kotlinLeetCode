package com.example.kotlinleetcode.easy

fun main() {

    println(summaryRanges(intArrayOf(0, 1, 2, 4, 5, 7)))

}

fun summaryRanges(nums: IntArray): List<String> {

    val result = ArrayList<String>()

    var l = 0
    var r = 1
    var it = 1

    while (r <= nums.lastIndex) {

        if (nums[l] == nums[r] - it) {
            // next value
            it++
            r++
            continue
        }

        result.add("${nums[l]}->${nums[r]}")
        l = r+1
        r = l+1

    }

    return result
}