package com.example.kotlinleetcode.easy

fun main() {

    println( removeTrailingZeros("51230100"))

}

fun removeTrailingZeros(num: String): String {

    num.reversed().withIndex().forEach { i ->
        if (i.value != '0') return num.slice(0..num.lastIndex - i.index)
    }
    return num
}