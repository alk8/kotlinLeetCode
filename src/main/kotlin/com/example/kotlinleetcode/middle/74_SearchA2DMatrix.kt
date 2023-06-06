package com.example.kotlinleetcode.middle

fun main() {

}

fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {

    for (m in matrix.lastIndex downTo 0){
        if (matrix[m][0] > target) continue
        for (n in matrix[m]) if (n == target) return true
    }
    return false
}