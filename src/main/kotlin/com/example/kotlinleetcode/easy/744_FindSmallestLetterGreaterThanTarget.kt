package com.example.kotlinleetcode.easy

fun main() {

    println( nextGreatestLetter(charArrayOf('c', 'f', 'j'), 'a'))
    println( nextGreatestLetter(charArrayOf('c', 'f', 'j'), 'c'))
    //println( nextGreatestLetter(charArrayOf('c', 'f', 'j'), 'a'))

}

fun nextGreatestLetter(letters: CharArray, target: Char): Char {

    val smallLetters = letters.filter { c ->
        c.hashCode() > target.hashCode()
    }

    return if (smallLetters.isEmpty()){
        letters[0]
    } else{
        smallLetters[0]
    }

}