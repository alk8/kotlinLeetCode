package com.example.kotlinleetcode.middle

fun main() {

    // SOLVED

   // println(groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat")))
    println(groupAnagrams(arrayOf("stop","pots","reed","","tops","deer","opts","")))

}

fun groupAnagrams(strs: Array<String>): List<List<String>> {

    val result: ArrayList<ArrayList<String>> = ArrayList()
    solve(result, strs, 0,strs.size)
    return result
}

fun solve(result: ArrayList<ArrayList<String>>, strs: Array<String>, i: Int,c: Int) :Int {
    // added word
    var count = c
    var j = i + 1
    result.add(arrayListOf(strs[i]))
    count--
    while ( count !=0) {
        if (check(strs[i], strs[j])) {
            // is anagram
            result[result.lastIndex].add(strs[j])
            count--
        } else {
            var needDeeper = true
            for (pastWords in result) {
                if (check(pastWords[0], strs[j])) {
                    pastWords.add(strs[j])
                    count--
                    needDeeper = false
                    break
                }
            }
            if (needDeeper){
                count = solve(result, strs, j,count)
                break
            }
        }
        j++
    }
    return count
}

fun check(word1: String, word2: String): Boolean {

    if (word1.length != word2.length) return false

    val tempArray = word1.toCharArray().sortedArray()
    val secondArray = word2.toCharArray().sortedArray()
    for (x in 0..tempArray.lastIndex) {
        if (tempArray[x] != secondArray[x]) {
            return false
        }
    }
    return true
}
