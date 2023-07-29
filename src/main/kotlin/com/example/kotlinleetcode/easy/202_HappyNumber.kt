package com.example.kotlinleetcode.easy


fun main() {

    //isHappy(19)
    // SOLVED
    isHappy(1111111)

}

fun isHappy(n: Int): Boolean {

    var number = n
    while (true) {

        val d = number.toString().toCharArray().map { c: Char -> c.toString().toInt() }
        var result = 0

        d.forEach { i ->  result+= i*i }

        if (result in 0..1 || result ==7) return true
        // отмена цикла
        if (result in 2..9) return false
        number = result

    }
}