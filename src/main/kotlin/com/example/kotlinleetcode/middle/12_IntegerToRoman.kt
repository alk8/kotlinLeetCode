package com.example.kotlinleetcode.middle

import com.sun.source.tree.IfTree

fun main() {

    println(intToRoman(38))
    println(intToRoman(1994))

}

fun intToRoman(num: Int): String {

    // first if number equals between 1 and 3 we always divide symbol
    // second number who contains a 1 at start
    val moreFive = charArrayOf('V', 'L', 'D')
    val meleeFive = charArrayOf('I', 'X', 'C', 'M')
    val result: StringBuilder = java.lang.StringBuilder()

    val mem = num.toString().toCharArray().map { c: Char -> Character.digit(c, 10) }
    var count = mem.size

    for (it in mem) {

        if (it in 1..3) {
            for (j in 1..it) {
                result.append(meleeFive[count - 1])
            }
        } else if (it in 5..8) {

            result.append(moreFive[count - 1])

            for (j in 1..it - 5) {
                result.append(meleeFive[count - 1])
            }

        } else {

            if (it != 0) {
                // 4 or 9
                if (it == 9) {
                    result.append(meleeFive[count - 1])
                    result.append(meleeFive[count])
                } else {
                    result.append(meleeFive[count - 1])
                    result.append(moreFive[count - 1])
                }
            }
        }
        count--
    }
    return result.toString()
}