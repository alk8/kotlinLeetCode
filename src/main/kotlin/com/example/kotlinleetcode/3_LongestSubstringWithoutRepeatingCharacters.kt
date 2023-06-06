package com.example.kotlinleetcode

fun main() {
    //println(lengthOfLongestSubstring("pwwkew"))
    //println(lengthOfLongestSubstring("abcabcbb"))
    //println(lengthOfLongestSubstring("bbbbb"))
    //println(lengthOfLongestSubstring("au"))
    println(lengthOfLongestSubstring("qrsvbspk"))
    //println(lengthOfLongestSubstring("au"))
    println(lengthOfLongestSubstring("cdd"))
}


fun lengthOfLongestSubstring(s: String): Int {

    if (s.isEmpty()) return 0
    var result = -1
    val data = HashSet<Char>()
    var i = 0
    var check = 0

    while (i <= s.lastIndex) {
        if (!data.contains(s[i])) {
            data.add(s[i])
            i++
        } else {
            if (result <= data.size) {
                if(result ==-1){
                    result = data.size-1
                }else{
                    result = data.size
                }
                data.clear()
            }
            check++
            i = check
        }
    }
    return Integer.max(result, data.size)
}