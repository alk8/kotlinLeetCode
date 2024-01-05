package com.example.kotlinleetcode.easy

fun main() {

    println(countSegments("Hello, my name is John"))
    //println(countSegments(", , , ,        a, eaefa"))
    //println(countSegments("                "))
}

fun countSegments(s: String): Int {

    var having = false

    if(s.isEmpty()) return 0

    var result = 0

    s.forEach {
        if (it == ' ') {
            if (having){
                result++
                having = false
            }
        }else{
            having = true
        }
    }

    return if (having) {
        result + 1
    }else{
        result
    }

}