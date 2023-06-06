package com.example.kotlinleetcode.easy

fun main() {
    // var c = charArrayOf('h','e','l','l','o')
    var c = charArrayOf('h', 'a', 'n', 'g', 'o', 'l')
    reverseString(c)
    println(c)
}

fun reverseString(s: CharArray): Unit {

    for (index in 0..s.lastIndex) {
        if (s.size / 2 == index) break
        s[index] = s[s.lastIndex.minus(index)].also { s[s.lastIndex.minus(index)] = s[index] }
    }

}