package com.example.kotlinleetcode

fun main() {
    print(compress(charArrayOf('a','b','b','b','b','b','b','b','b','b','b','b','b','b','b')))
}

fun compress(chars: CharArray): Int {

   if (chars.isEmpty()) return 0

   var currentChar = chars[0]
   var result = 0
   var str =""

   for (c in chars){

       if (currentChar == c){
           result++
       }else{
           str += currentChar + result
           currentChar = c
           result = 1
       }
   }
    return str.length
}