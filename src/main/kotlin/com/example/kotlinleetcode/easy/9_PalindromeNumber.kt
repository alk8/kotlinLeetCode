package com.example.kotlinleetcode.easy

fun main() {
    // SOLVED
}

fun isPalindrome(x: Int): Boolean {
    val s: String = x.toString()
    return s.reversed() == s
}