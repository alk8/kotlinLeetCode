package com.example.kotlinleetcode.easy

fun main() {
    //SOLVED
}

fun lengthOfLastWord(s: String): Int {
    val ar: List<String> = s.split(" ")

    for (i in ar.lastIndex downTo 0){
        if (ar[i].isNotEmpty()){
            return ar[i].length
        }
    }
    return 0
}