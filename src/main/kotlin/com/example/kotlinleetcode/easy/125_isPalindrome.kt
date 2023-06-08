package com.example.kotlinleetcode.easy

fun main() {
    println(isPalindrome("A man, a plan, a canal: Panama"))
}

fun isPalindrome(s: String): Boolean {

    val t = "[^A-Za-z0-9]".toRegex().replace(s, "").toLowerCase()

    var left = 0
    var right = t.lastIndex

    while (left < right) {
        if (t[left] != t[right]) {
            return false
        } else {
            left++
            right--
        }
    }

    return true

}


