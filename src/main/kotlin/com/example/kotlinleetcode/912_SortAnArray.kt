package com.example.kotlinleetcode

fun main(){

}

fun sortArray(nums: IntArray): IntArray {
    // quick sort
    return quickSort(nums)
}

fun quickSort(nums:IntArray):IntArray{

    if (nums.size < 2) return nums

    val pvt = nums[0]

    val left = ArrayList<Int>()
    val right = ArrayList<Int>()

    for(i in 1..nums.lastIndex){

        when {
            pvt > nums[i] -> left.add(nums[i])
            else -> right.add(nums[i])
        }
    }
    return quickSort(left.toIntArray()) + pvt + quickSort(right.toIntArray())
}