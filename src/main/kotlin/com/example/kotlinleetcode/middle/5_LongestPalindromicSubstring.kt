package com.example.kotlinleetcode.middle

fun main(){

    fun longestPalindrome(s: String): String {

        val arr = s.toCharArray()
        // two point
        var l = 0
        var r = arr.lastIndex

        while (l < r){

            if (arr[l] == arr[r]){
                l++
                r--
            }else{
                r--
            }

        }

        return ""

    }
}