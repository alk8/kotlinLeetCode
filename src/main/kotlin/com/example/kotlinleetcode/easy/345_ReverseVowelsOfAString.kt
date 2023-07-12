package com.example.kotlinleetcode.easy

fun main() {

    println(reverseVowels("hello"))

}

fun reverseVowels(s: String): String {

    var l = 0
    var r = s.lastIndex
    val chars = s.toCharArray()

    val memory = hashSetOf('a','e','i','o','u','A','E','I','O','U')

    while (l<r){

        val leftVowel : Boolean = memory.contains(chars[l])
        val rightVowel : Boolean = memory.contains(chars[r])

        if (leftVowel && rightVowel){
            chars[l] = s[r].also { chars[r] = s[l]}
            l++
            r--
            continue
        }

        if (!leftVowel) l++
        if (!rightVowel) r--
    }

    return String(chars)

}