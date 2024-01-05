package com.example.kotlinleetcode.easy

fun main() {

    println(licenseKeyFormatting("5F3Z-2e-9-w", 4))
    println(licenseKeyFormatting("--a-a-a-a--", 2))
    println(licenseKeyFormatting("---", 3))

}

fun licenseKeyFormatting(s: String, k: Int): String {

    var res = ""
    var it = k

    for (i in s.lastIndex downTo 0) {
        if (s[i] == '-') continue
        res += s[i].uppercase()
        it--

        if (it == 0) {
            if (i != 0) res += "-"
            it = k
        }
    }

    if (res.isEmpty()) return ""
    if (res[res.lastIndex] == '-'){
        res = res.substring(0 until res.lastIndex)
    }

    return res.reversed()
}