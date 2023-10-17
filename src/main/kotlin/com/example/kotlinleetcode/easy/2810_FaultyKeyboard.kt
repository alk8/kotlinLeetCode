package com.example.kotlinleetcode.easy

fun main() {

}

fun finalString(s: String): String {

    val r = StringBuilder()

    s.forEach {

        if (it == 'i'){
            r.reverse()
        }else{
            r.append(it)
        }

    }

    return r.toString()
}
