package com.example.kotlinleetcode.middle

fun main() {

    println(simplifyPath("/home//foo/"))

}

fun simplifyPath(path: String): String {

    var lastSymbol: Char = '-'
    val slash = '/'

    val res = StringBuilder()

    for (s in path){

        if (s == slash){
            if (lastSymbol != slash){
                res.append(s)
                lastSymbol = s
                continue
            }else{
                continue
            }
        }

        if (s != '.') {
            res.append(s)
        }else{
            res.clear()
        }
        lastSymbol = s
    }
    if (lastSymbol == slash && res.length >1){
        res.deleteCharAt(res.lastIndex)
    }

    return res.toString()
}