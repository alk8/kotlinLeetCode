package com.example.kotlinleetcode

fun main(){

}

fun maxSubArray(nums: IntArray): Int {

    nums.sort()
    var result = 0

    for (i in nums.lastIndex downTo 0){
        if (nums[i] <=0){
            return result
        }
        result +=nums[i]
    }
    return result

}

