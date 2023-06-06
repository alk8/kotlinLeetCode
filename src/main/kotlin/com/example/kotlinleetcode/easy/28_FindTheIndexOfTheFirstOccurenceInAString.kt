package com.example.kotlinleetcode.easy


// SOLVED

fun main() {

  //  strStr("sadbutsad","sad")
    strStr("leetcode","leeto")
}

fun strStr(haystack: String, needle: String): Int {

    val r = haystack.split(needle)
    if (r.size > 1) return r[0].length
    return -1

}