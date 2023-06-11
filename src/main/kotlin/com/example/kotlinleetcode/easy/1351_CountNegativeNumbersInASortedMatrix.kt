package com.example.kotlinleetcode.easy

fun main() {

    val a =
        arrayOf(intArrayOf(4, 3, 2, -1), intArrayOf(3, 2, 1, -1), intArrayOf(1, 1, -1, -2), intArrayOf(-1, -1, -2, -3))

    println(countNegatives(a))

}

fun countNegatives(grid: Array<IntArray>): Int {

    var result = 0
    var i = 0

    while (i <= grid.lastIndex) {
        var j = grid[i].lastIndex

        while (j >= 0) {
            if (grid[i][j] >= 0) break
            result++
            j--
        }
        i++
    }
    return result
}