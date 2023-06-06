package com.example.kotlinleetcode.easy

// SOLVED

fun main() {
    println(generate(5))
}

fun generate(numRows: Int): List<List<Int>> {

    val sideValue = 1
    val result = arrayListOf<List<Int>>()

    for (i in 0 until numRows) {
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

    return result

}


