package com.example.kotlinleetcode.easy

fun main() {
    // SOLVED
    fun moveZeroes(nums: IntArray): Unit {
        var it = 0
        for (n in nums) {
            if (n != 0) {
                nums[it] = n
                it++
            }
        }
        for (i in it..nums.lastIndex){
            nums[i] = 0
        }
    }
}


