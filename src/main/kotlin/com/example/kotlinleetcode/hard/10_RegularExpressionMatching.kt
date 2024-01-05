package com.example.kotlinleetcode.hard

fun main() {
    // SOLVED
}

fun isMatch1(s: String, p: String): Boolean {
    if (p.contains(".") || p.contains("*")) return s.matches(regex = Regex(p))
    return s.equals(p)
}
