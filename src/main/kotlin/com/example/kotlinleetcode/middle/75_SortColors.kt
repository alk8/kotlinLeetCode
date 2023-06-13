package com.example.kotlinleetcode.middle

fun main() {

}

fun sortColors(nums: IntArray): Unit {

    var zeros = 0
    var one = 0
    var twos = 0

    nums.forEach {
        when (it) {
            0 -> {
                zeros++
            }
            1 -> {
                one++
            }
            else -> {
                twos++
            }
        }
    }

    for (i in 0..nums.lastIndex) {
        nums[i] = if (zeros > 0) {
            zeros--
            0
        } else if (one > 0) {
            one--
            1
        } else {
            twos--
            2
        }
    }
}