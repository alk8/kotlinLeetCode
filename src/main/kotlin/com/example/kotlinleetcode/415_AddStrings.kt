package com.example.kotlinleetcode

fun main() {

    print(addStrings("11","123"))

}

fun addStrings(num1: String, num2: String): String {

    var maxIter: Int;
    var minIter: Int
    val max: String;
    val min: String
    var mem = 0
    val str = StringBuilder()

    if (num1.length > num2.length) {
        max = num1
        min = num2
        maxIter = max.lastIndex
        minIter = min.lastIndex
    } else {
        min = num1
        max = num2
        maxIter = max.lastIndex
        minIter = min.lastIndex
    }
    while (maxIter >= 0 || minIter >= 0 || mem != 0) {

        if (maxIter>=0) mem +=max[maxIter]-'0'
        if (minIter>=0) mem +=min[minIter]-'0'
        str.append(mem%10)
        mem /=10
        maxIter--
        minIter--
    }
    return str.reverse().toString()
}