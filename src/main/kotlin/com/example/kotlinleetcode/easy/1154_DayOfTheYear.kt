package com.example.kotlinleetcode

// SOLVED
fun main() {
    println(dayOfYear("1900-05-02"))
}

fun dayOfYear(date: String): Int {
    var result = 0
    val hm = HashMap<Int,Int>()
    hm["01".toInt()] = 31
    hm["02".toInt()] = 28
    hm["03".toInt()] = 31
    hm["04".toInt()] = 30
    hm["05".toInt()] = 31
    hm["06".toInt()] = 30
    hm["07".toInt()] = 31
    hm["08".toInt()] = 31
    hm["09".toInt()] = 30
    hm["10".toInt()] = 31
    hm["11".toInt()] = 30
    hm["12".toInt()] = 31

    // 0000-00-00
    val dateStructure = date.split("-")

    val year = dateStructure[0].toInt()
    val month = dateStructure[1].toInt()
    val days = dateStructure[2].toInt()

    for(h in hm){
        if (h.key == month) break
        if (h.key == 2 && ((year % 4 == 0 && year % 100 !=0)|| year % 400 ==0)) result++
        result += h.value
    }
    return result + days.toInt()
}

