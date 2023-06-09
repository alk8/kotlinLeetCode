package com.example.kotlinleetcode.easy


// SOLVED
fun main() {

    reverseOnlyLetters("ab-cd")

}

fun reverseOnlyLetters(s: String): String {

    var l = 0
    var r = s.lastIndex
    val arr = s.toCharArray()
    var result =""

    while (l<r){
        if (arr[l].isLetter() && arr[r].isLetter()){
            arr[l] = arr[r].also { arr[r] = arr[l] }
            l++
            r--
        }else if (!arr[l].isLetter()){
            l++
        }else{
            r--
        }
    }

    arr.forEach { c -> result+=c }
    return result
}

