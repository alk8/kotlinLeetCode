package com.example.kotlinleetcode.easy

fun main() {

    println("abcdefg",)

}

fun reverseStr(s: String, k: Int): String {

    val a = s.substring(0 until k).reversed()
    val b = s.substring(k..s.lastIndex)

    return a + b

}