package com.example.kotlinleetcode

//SOLVED

fun main() {

    print(hasAlternatingBits(5))

}
fun hasAlternatingBits(n: Int): Boolean {

    val binary = Integer.toBinaryString(n)

    for (s in 0 until binary.lastIndex){
        if (binary[s] == binary[s+1]){
            return false
        }
    }
    return true
}
