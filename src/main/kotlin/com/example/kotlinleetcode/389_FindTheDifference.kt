package com.example.kotlinleetcode.easy

fun main() {

}

fun findTheDifference(s: String, t: String): Char {
    return if (s.length > t.length) findDiff(s,t) else findDiff(t,s)
}

fun findDiff(max:String,min:String):Char{
    for (m in 0..max.lastIndex){
        if (!min.contains(max[m])) return max[m]
    }
    return max[max.lastIndex]
}