package com.example.kotlinleetcode.easy

fun main() {
    wordPattern("abba","dog dog dog dog")
}

fun wordPattern(pattern: String, s: String): Boolean {

    val mem: HashMap<Char, String> = HashMap()
    val words = s.split(" ")

    if (words.size != pattern.length) return false

    for (i in 0..pattern.lastIndex) {
        if (mem.containsKey(pattern[i])) {
            if (mem[pattern[i]] == words[i]) continue
            return false
        } else {
            if (mem.containsValue(words[i])){
                return false
            }
            mem[pattern[i]] = words[i]
        }
    }
    return true
}