package com.example.kotlinleetcode.easy

fun main() {

}


fun canConstruct(ransomNote: String, magazine: String): Boolean {

    val list = magazine.toMutableList()

    ransomNote.forEach { c: Char ->
        if (!list.remove(c)) {
            return false
        }

    }

    return true

}