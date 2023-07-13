package com.example.kotlinleetcode.middle

fun main() {

   // println(letterCombinations("23"))
    println(letterCombinations("234"))

}

fun letterCombinations(digits: String): List<String> {

    var memory: HashMap<Char, Array<String>> = HashMap()
    memory['2'] = arrayOf("a", "b", "c")
    memory['3'] = arrayOf("d", "e", "f")
    memory['4'] = arrayOf("g", "h", "i")
    memory['5'] = arrayOf("j", "k", "l")
    memory['6'] = arrayOf("m", "n", "o")
    memory['7'] = arrayOf("p", "q", "r", "s")
    memory['8'] = arrayOf("t", "u", "v")
    memory['9'] = arrayOf("w", "x", "y", "z")

    val result: ArrayList<String> = ArrayList()

    if (digits.length == 1) {
        for (text in memory[digits[0]]!!) {
            result.add(text)
        }
        return result
    }

    memory = memory.filter { entry -> digits.contains(entry.key) } as HashMap<Char, Array<String>>

    var x = 0
    var y = 0


   for (m in memory){

   }



    return result
}