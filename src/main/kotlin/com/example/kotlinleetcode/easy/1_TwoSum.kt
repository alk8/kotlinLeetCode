package com.example.kotlinleetcode.easy

fun main() {

}

fun twoSum(nums: IntArray, target: Int): IntArray {
    //SOLVED
    var it = 0
    while (it < nums.size) {
        var j = it + 1
        while (j < nums.size) {
            if (target == nums[it] + nums[j]) {
                return intArrayOf(it, j)
            }
            j++
        }
        it++
    }
    return intArrayOf()
}
