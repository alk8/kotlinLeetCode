package com.example.kotlinleetcode.easy

// SOLVED

fun main() {
    println(diagonalSum(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))))
}

fun diagonalSum(mat: Array<IntArray>): Int {

    var r = 0
    val even = mat.size % 2 == 0
    val center = mat.size / 2
    var m = 0
    var n = 0


    // on left to right corner
    while (m <= mat.lastIndex && n <= mat.lastIndex) {
        if (!(m == center && n == center && !even)) r += mat[m][n]
        m++
        n++
    }

    m = 0
    n = mat.lastIndex

    // on right to left
    while (m <= mat.lastIndex && n >= 0) {
        r += mat[m][n]
        m++
        n--
    }
    return r
}