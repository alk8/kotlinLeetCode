package com.example.kotlinleetcode.easy

fun main() {

}

fun isUgly(n: Int): Boolean {

    var num = n

    if (n == 0) true

    while (true){

        if (num % 2 == 0){
            num /= 2
            continue
        }

        if (num % 3 == 0){
            num /=3
            continue
        }

        if (num % 5 == 0){
            num /=5
            continue
        }

        return num == 1

    }

}
