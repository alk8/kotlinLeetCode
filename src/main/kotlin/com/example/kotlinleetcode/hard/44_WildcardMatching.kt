package com.example.kotlinleetcode.hard

fun main() {

    //println(isMatch("aa", "a"))
    //println(isMatch("aa", "*"))
    println(isMatch("adceb", "*a*b"))

}

fun isMatch(s: String, p: String): Boolean {

    // first, if symbols in s string stay is false
    val it = s.iterator()
    var sym: Char = 'l'
    var haveAny = false

    for (command in p) {
        // take symbol
        if (it.hasNext()) {
            if (!haveAny){
                sym = it.next()
            }
        } else {
            return false
        }

        when (command) {
            '?' -> {
                // any single
                haveAny = false
                if (sym == ' ') return false
            }

            '*' -> {
                haveAny = true
            }

            else -> {
                haveAny = false
                if (sym != command) return false
            }
        }
    }
    return !it.hasNext()
}