package com.example.kotlinleetcode.easy

fun main() {

    println(countBits(2))


}

fun countBits(n: Int): IntArray {

    val res: IntArray= IntArray(n+1)

    for (i in 0..n){
        res[i] = i.toString(2).count { c: Char -> c == '1' }
    }

    return res
}