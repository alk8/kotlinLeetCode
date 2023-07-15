package com.example.kotlinleetcode.easy

fun main() {

    //println(isAnagram("rat","car"))
    println(isAnagram("anagram","nagaram"))

}

fun isAnagram(s: String, t: String): Boolean {

    if (s.length != t.length) return false

    val sArray = s.toCharArray().sortedArray()
    val tArray = t.toCharArray().sortedArray()

    for (i in sArray.indices){
        if (sArray[i] != tArray[i]) return false
    }

    return true
}