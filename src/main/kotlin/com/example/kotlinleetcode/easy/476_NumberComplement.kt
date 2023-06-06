package com.example.kotlinleetcode
// SOLVED
fun main() {

    print(findComplement(5))

}

fun findComplement(num: Int): Int {

    val binary = Integer.toBinaryString(num)
    var result = ""

    for (s in binary){
        val symbol = if(s == '1') 0 else 1
        result += symbol
    }

    return result.toInt(2)
}