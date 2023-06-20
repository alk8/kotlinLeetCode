package com.example.kotlinleetcode.easy

fun main() {

    mergeAlternately("abc","pqr")

}

fun mergeAlternately(word1: String, word2: String): String {

    var i  = 0
    val str = StringBuilder()

    while (true){

        if (word1.lastIndex < i || word2.lastIndex <i){
            if (word1.lastIndex == word2.lastIndex) break

            if (word1.lastIndex > word2.lastIndex){
                // word 1 bigger
                for (j in i..word1.lastIndex){
                    str.append(word1[j])
                }
                break

            }else{
                // word 2 bigger
                for (j in i..word2.lastIndex){
                    str.append(word2[j])
                }
                break
            }

        }
        str.append(word1[i])
        str.append(word2[i])
        i++
    }
    return str.toString()
}
