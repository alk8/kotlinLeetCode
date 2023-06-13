package com.example.kotlinleetcode.easy

import kotlin.math.roundToInt

fun main() {

  // println( percentageLetter("foobar",'o'))
   println( percentageLetter("foobar",'o'))

}

fun percentageLetter(s: String, letter: Char): Int {

    val size = s.length.toDouble()
    val trim = size - s.replace(letter.toString(),"").length
    return ((trim / size * 100).toInt())

}