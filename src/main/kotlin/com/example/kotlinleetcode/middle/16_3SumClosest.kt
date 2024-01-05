package com.example.kotlinleetcode.middle

import kotlin.math.absoluteValue

fun main() {

//    println(threeSumClosest(intArrayOf(-1,2,1,-4),1)) //2
//    println(threeSumClosest(intArrayOf(0,0,0),1)) // 0
//    println(threeSumClosest(intArrayOf(1, 1, 1, 0), 100)) // 3
//    println(threeSumClosest(intArrayOf(1, 1, 1, 0), -100)) // 2
    println(threeSumClosest(intArrayOf(4,0,5,-5,3,3,0,-4,-5), -2)) // 2
}

fun threeSumClosest(nums: IntArray, target: Int): Int {

    var result = if (target < 0) Int.MIN_VALUE else Int.MAX_VALUE

    for (i in 0..nums.lastIndex - 2) {
        val num = nums[i] + nums[i + 1] + nums[i + 2]

        if (target < 0){
            if (result < (num - target).absoluteValue) result = num
        }else{
            if (result > (num - target).absoluteValue) result = num
        }
    }
    return result
}