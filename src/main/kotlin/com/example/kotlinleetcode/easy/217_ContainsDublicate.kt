package com.example.kotlinleetcode.easy

fun main() {
    // SOLVED
}

fun containsDuplicate(nums: IntArray): Boolean {

    var it = 0;
    for (x in it until nums.size) {
        var z = it + 1
        for (y in z until nums.size) {
            if (nums[x] == nums[z]) return true
            z++
        }
        it++
    }

    return false
}