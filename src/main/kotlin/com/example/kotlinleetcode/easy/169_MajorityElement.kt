package com.example.kotlinleetcode.easy

import kotlin.math.max

fun main() {

    // SOLVED

    println(majorityElement(intArrayOf(3,2,3)))

}

fun majorityElement(nums: IntArray): Int {

    val data : HashMap<Int,Int> = HashMap()

    nums.forEach{

        if (data.containsKey(it)){
            data[it] = data[it]!! + 1
        }else{
            data[it] = 1
        }

    }

    var max = -1
    var result = 0

    data.forEach{entry: Map.Entry<Int, Int> ->
        if (max < entry.value) {
            max = entry.value
            result = entry.key
        }
    }


    return result
}