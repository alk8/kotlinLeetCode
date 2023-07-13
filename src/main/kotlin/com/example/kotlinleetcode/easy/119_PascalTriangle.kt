package com.example.kotlinleetcode.easy

fun main() {

    // SOLVE

    //getRow(0)
    getRow(3)
    getRow(1)


}

fun getRow(rowIndex: Int): List<Int> {

    val sideValue = 1
    val result = arrayListOf<List<Int>>()

    for (i in 0..rowIndex) {
        // generated list
        val row: MutableList<Int> = MutableList(i + 1) { 0 }
        // side values always equal '1'
        row[0] = sideValue
        row[row.lastIndex] = sideValue

        // check previous floor
        if (result.indices.contains(i - 1) && i > 1) {
            for (j in 1 until i){
                row[j] = result[i-1][j-1] + result[i-1][j]
            }
        }
        result.add(row)
    }
    return result[result.lastIndex]
}