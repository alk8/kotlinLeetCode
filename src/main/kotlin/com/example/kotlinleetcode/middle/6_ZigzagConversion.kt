package com.example.kotlinleetcode.middle

fun main() {
    // SOLVED
    println(convert("PAYPALISHIRING", 3))
}

fun convert(s: String, numRows: Int): String {

    val hm = HashMap<Int, String>()
    var forward = true
    var count = 1
    var result = ""

    for (i in 1..numRows) {
        hm[i] = ""
    }
    for (str in s) {
        if (count == 0) count = 1
        forward = when (count) {
            numRows -> {false}
            1 -> {true}
            else -> {forward}
        }
        hm[count] = hm[count] + str
        if (forward) count++ else count--
    }

    hm.forEach { (_, u) -> result += u }
    return result
}