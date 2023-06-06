package com.example.kotlinleetcode.easy

fun main() {
    // SOLVED
}

fun detectCapitalUse(word: String): Boolean {

    if (word.length ==1) return true

    val firstSymbolIsLowerCase = word[0].isLowerCase()
    val w = word.substring(1 until word.length)
    var firstSymbol = w[0]
    for (c in w) {

        if (firstSymbolIsLowerCase) {
            if (c.isUpperCase()) return false
        } else {

            if(firstSymbol.isLowerCase() && c.isLowerCase() || firstSymbol.isUpperCase() && c.isUpperCase()){
                firstSymbol = c
                continue
            }
            return false
        }
    }
    return true
}