package com.example.kotlinleetcode.easy

fun main(){

    //SOLVED

   // println(longestCommonPrefix(arrayOf("flower","flow","flight")))
    //println(longestCommonPrefix(arrayOf("")))
    //println(longestCommonPrefix(arrayOf("ab","a")))
    println(longestCommonPrefix(arrayOf("flower","flower","flower","flower")))

}

fun longestCommonPrefix(strs: Array<String>): String {

    if (strs.isEmpty()) return ""
    if (strs.size == 1) return strs[0]

    val str = StringBuilder()
    var count = 0
    var i = 0

    while (i <= strs.lastIndex){
        var j = i + 1
        if (count > strs[i].lastIndex){
            return str.toString()
        }
        if (strs[i] == "") return str.toString()
        while (j <= strs.lastIndex){
            if (count > strs[j].lastIndex){
                return str.toString()
            }
            if (strs[j] == "") return str.toString()
            if (strs[j][count] != strs[i][count]){
                return str.toString()
            }
            j++
        }
        str.append(strs[i][count])
        count++
        i = 0
    }
    return str.toString()
}