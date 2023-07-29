package com.example.kotlinleetcode.middle

import kotlin.math.min
import kotlin.math.max

fun main() {

    println(
        eraseOverlapIntervals(
            arrayOf(
                intArrayOf(1, 100),
                intArrayOf(11, 22),
                intArrayOf(1, 11),
                intArrayOf(2, 12)
            )
        )
    )


}

fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {

    var result = 0

    if (intervals.size < 2) return 0

    var min = intervals[0][0]
    var max = intervals[0][1]

    for (i in 1..intervals.lastIndex) {

        if (intervals[i][0] in min..max && intervals[i][1] in min..max) {
            result++
        } else {
            min = min(min, intervals[i][0])
            max = max(max, intervals[i][1])
        }
    }

    return result
}