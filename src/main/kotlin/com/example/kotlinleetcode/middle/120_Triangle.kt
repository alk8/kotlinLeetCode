package com.example.kotlinleetcode.middle

import kotlin.math.min

fun main() {
   // println(minimumTotal(listOf(listOf(2), listOf(3, 4), listOf(6, 5, 7), listOf(4, 1, 8, 3))))
    println(minimumTotal(listOf(listOf(-1), listOf(2,3), listOf(1,-1,-3))))
}

fun minimumTotal(triangle: List<List<Int>>): Int {

    var result = 0
    var stepL = 0
    var stepR = 0

    for (i in 0..triangle.lastIndex) {
        val t = triangle[i]

        var min = min(t[stepL],t[stepR])

        if (i != triangle.lastIndex) {
            if (t[stepL] + triangle[i + 1][stepL] > t[stepR] + triangle[i + 1][stepR + 1]) {
                min = if (t.indices.contains(stepR+1)){
                    min(t[stepR],t[stepR+1])
                }else{
                    t[stepR]
                }
            } else {
                min = min(t[stepL],t[stepR])
            }
        }

        stepL = t.indexOf(min)
        stepR = stepL + 1

        result += min
    }
    return result
}

