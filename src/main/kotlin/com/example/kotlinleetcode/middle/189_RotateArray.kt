package com.example.kotlinleetcode.middle

fun main() {


}

fun rotate(nums: IntArray, k: Int): Unit {

    var l = k
    var r = nums.lastIndex

    while (l<r){
        nums[l] = nums[r].also { nums[r] = nums[l] }



    }



}


