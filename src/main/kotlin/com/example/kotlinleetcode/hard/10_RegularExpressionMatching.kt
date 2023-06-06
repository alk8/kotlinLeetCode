package com.example.kotlinleetcode.hard

fun main() {
    // SOLVED
}

fun isMatch(s: String, p: String): Boolean {
    if (p.contains(".") || p.contains("*")) return s.matches(regex = Regex(p))
    return s.equals(p)
}
