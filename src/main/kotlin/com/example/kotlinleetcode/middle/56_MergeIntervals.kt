package com.example.kotlinleetcode.middle

import kotlin.math.max
import kotlin.math.min

fun main() {

    //merge(arrayOf(intArrayOf(1,3), intArrayOf(2,6), intArrayOf(8,10), intArrayOf(15,18)))
    merge(arrayOf(intArrayOf(1,4), intArrayOf(0,0)))

}

fun merge(intervals: Array<IntArray>): ArrayList<IntArray> {

    var element = intervals[0]
    val result = arrayListOf<IntArray>()

    for (i in 1..intervals.lastIndex){

        if (intervals[i][0] == intervals[i][1]){
            result.add(intervals[i])
            continue
        }

       if (element[1] !in intervals[i][0]..intervals[i][1]){
           result.add(element)
           element = intervals[i]
           continue
       }
        element[0] = min(intervals[i][0],element[0])
        element[1] = max(intervals[i][1],element[1])
    }
    result.add(element)
    return result
}