package com.example.kotlinleetcode.easy

fun main() {
    println(isSubsequence("abc","ahbgdc"))
}

fun isSubsequence(s: String, t: String): Boolean {

    var count = s.lastIndex

    for (i in (0..t.lastIndex).reversed()){
        if (count ==-1) break
        if (t[i] == s[count]) count--
    }
    return count ==-1
}

