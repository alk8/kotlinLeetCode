package com.example.kotlinleetcode.easy

fun main() {
    //SOLVED
}

fun fizzBuzz(n: Int): List<String> {

    val l:ArrayList<String> = ArrayList()
    var index = 1
    while (index <= n){

        if (index % 3 ==0 && index % 5==0){
            l.add("FizzBuzz")
        }else if (index % 3 ==0){
            l.add("Fizz")
        }else if (index % 5 ==0){
            l.add("Buzz")
        }else{
            l.add(index.toString())
        }
        index++
    }
    return l
}