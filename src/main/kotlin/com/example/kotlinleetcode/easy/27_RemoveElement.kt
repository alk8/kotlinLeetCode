package com.example.kotlinleetcode.easy

fun main() {

    removeElement(intArrayOf(3, 2, 2, 3), 3)

}

fun removeElement(nums: IntArray, `val`: Int): Int {

    var count = 0

    nums.forEachIndexed { index, it ->
        if (it == `val`) {
            count++
            nums[index] = Int.MAX_VALUE
        }
    }

    return count

}