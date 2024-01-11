package com.example.kotlinleetcode.easy

fun main() {

}

fun maximum69Number (num: Int): Int {

    val s = num.toString().toCharArray()

    for (i in s.indices){
        if (s[i] == '6'){
            s[i] = '9'
            break
        }
    }

    return String(s).toInt()
}