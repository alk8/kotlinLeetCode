package com.example.kotlinleetcode.middle

fun main() {

    // Tests
//    println(myAtoi("42"))
    //println(myAtoi("      -42"))
//    println(myAtoi("4193   with words"))
    //println(myAtoi("words and 987"))
    println(myAtoi("-91283472332"))
    //println(myAtoi("3.14159"))
    // println(myAtoi("+1"))
    //println(myAtoi("+-12"))
    //println(myAtoi("20000000000000000000"))

}

fun myAtoi(s: String): Int {

    val str = s.trim()
    var parse = ""
    var first = false

    // check negative
    var negative: Boolean? = null

    for (it in str) {
        if (it == '-' && negative == null && parse.isEmpty()) {
            negative = true
        } else if (it == '+' && negative == null && parse.isEmpty()) {
            negative = false
        } else {
            if (it.isDigit()) {
                parse += it
                first = true
            } else {
                if (first) {
                    break
                } else {
                    return 0
                }
            }
        }
    }

    // take a number
    if (parse.isEmpty()) return 0
    return try {
        val result = parse.toInt()
        if (negative == true) result * -1 else result

    } catch (e: java.lang.NumberFormatException) {
        if (negative == true) Int.MIN_VALUE else Int.MAX_VALUE
    }
}
