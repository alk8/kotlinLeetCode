package com.example.kotlinleetcode.hard

fun main() {

    println(longestValidParentheses("(()"))
    println(longestValidParentheses("()(())"))

}

fun longestValidParentheses(s: String): Int {

    var result = 0
    val open = '('
    val closed = ')'
    var i = 0

    if (s.length < 2) return 0

    for ((index, c) in s.withIndex()){
        if (c == open){
            i=index
            break
        }else{
            continue
        }
    }

    while (i < s.lastIndex) {

        if (s[i] == open && s[i + 1] == closed) {
            result += 2
            i++
        } else {

            // valid pare
            if (s[i] == open) {
                var count = 1
                var j = i
                while (s[i] == s[j + 1]) {
                    count++
                    j++
                }

                val side = count
                j++

                while (count > 0) {
                    if (j > s.lastIndex) break
                    if (s[j] != closed) break
                    j++
                    count--
                }

                if (count == 0) {
                    result += (2 * side)
                }
                i = j
            }
        }
        i++
    }
    return result
}

