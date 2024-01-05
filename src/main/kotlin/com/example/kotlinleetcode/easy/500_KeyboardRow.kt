package com.example.kotlinleetcode.easy

fun main() {

    println(findWords(arrayOf("Hello","Alaska","Dad","Peace")))

}

fun findWords(words: Array<String>): Array<String> {

    var row : CharArray? = null
    val result: ArrayList<String> = arrayListOf()
    val row1 = "qwertyuiopQWERTYUIOP".toCharArray()
    val row2 = "asdfghjklASDFGHJKL".toCharArray()
    val row3 = "zxcvbnmZXCVBNM".toCharArray()
    var having = false
    words.forEach {

        having = false

        for (c in it){
            if (row == null){
                row = if (row1.contains(c)){
                    row1
                }else if (row2.contains(c)){
                    row2
                }else{
                    row3
                }
            }

            if (row!!.contains(c)){
                having = true
            }else{
                having = false
                break
            }

        }

        if (having) result.add(it)
        row = null

    }
    return result.toTypedArray()
}