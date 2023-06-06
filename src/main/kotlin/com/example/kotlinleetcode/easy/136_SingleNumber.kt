package com.example.kotlinleetcode.easy

fun main() {
    // SOLVED
}

fun singleNumber(nums: IntArray): Int {
    val data = HashMap<Int,Int>()
    data[nums[0]] = 1
    for (i in 1..nums.size-1){
        if (data.containsKey(nums[i])){
            data[nums[i]] = data[nums[i]]!! + 1
        }else{
            data.put(nums[i],1)
        }
    }
    return data.filter { entry -> entry.value==1}.iterator().next().key
}