package com.example.kotlinleetcode.middle

import kotlin.math.abs

fun main() {


}

fun minDistance(word1: String, word2: String): Int {
    val result = abs(word1.length - word2.length)
    return result
}

