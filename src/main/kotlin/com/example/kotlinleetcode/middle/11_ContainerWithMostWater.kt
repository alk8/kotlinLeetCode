package com.example.kotlinleetcode.middle

import kotlin.math.max
import kotlin.math.min

fun main() {

    println(maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))

}

fun maxArea(height: IntArray): Int {

    // *Conclusions
    // The maximum area is always the smallest of the two multiplied by the distance between them
    // It is necessary to check until the pointers meet
    // after calculating the area, you need to shift a smaller pointer
    var max = 0
    var l = 0
    var r = height.lastIndex

    while (l < r) {

        (min(height[l], height[r]) * (r - l)).also { i: Int -> max = max(max, i) }

        if (height[l] > height[r]) r-- else l++

    }

    return max
}
