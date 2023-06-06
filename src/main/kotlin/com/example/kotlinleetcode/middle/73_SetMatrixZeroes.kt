package com.example.kotlinleetcode

fun main() {

}

fun setZeroes(matrix: Array<IntArray>): Array<IntArray> {

    // SOLVED
    val hm = HashMap<String,HashSet<Int>>()
    hm["i"] = HashSet()
    hm["j"] = HashSet()

    for (i in 0..matrix.lastIndex) {
        for (j in 0..matrix[i].lastIndex) {
            if (matrix[i][j] == 0){
                hm["i"]?.add(i)
                hm["j"]?.add(j)
            }
        }
    }
    for (i in 0..matrix.lastIndex) {
        for (j in 0..matrix[i].lastIndex) {
            if (hm["i"]?.contains(i) == true || hm["j"]?.contains(j) == true){
                matrix[i][j] = 0
            }
        }
    }
    return matrix
}