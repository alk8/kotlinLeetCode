package com.example.kotlinleetcode.easy
import kotlin.math.pow

fun main() {
    //SOLVED
    print(addToArrayForm(intArrayOf(9, 3), 636))
}

fun addToArrayForm(num: IntArray, k: Int): List<Int> {

    val result = ArrayList<Int>()
    for (i in additionArrays(num, intToArray(k))) {
        result.add(i)
    }
    return result
}

fun intToArray(k: Int): IntArray {
    var n = k
    val capacity = getCapacityInt(k)
    var base = 10.0.pow(capacity.toDouble() - 1).toInt()
    val result = IntArray(capacity)
    for (i in 1..capacity) {
        val c = n / base
        result[i - 1] = c
        n -= base * c
        base /= 10
    }
    return result
}

fun getCapacityInt(k: Int): Int {

    val capacity = if (k == 0) {
        1
    } else {
        kotlin.math.log10(kotlin.math.abs(k.toDouble())).toInt() + 1
    }
    return capacity
}

fun additionArrays(i: IntArray, j: IntArray): IntArray {

    val smallest = if (i.lastIndex <= j.lastIndex) {
        i
    } else {
        j
    }
    val biggest = if (i.lastIndex <= j.lastIndex) {
        j
    } else {
        i
    }
    var indexSmall = smallest.lastIndex
    var indexBiggest = biggest.lastIndex
    var memory = 0

    while (indexSmall >= 0) {
        val resultAddition = smallest[indexSmall] + biggest[indexBiggest] + memory
        if (resultAddition < 10) {
            biggest[indexBiggest] = resultAddition
            memory = 0
        } else {
            biggest[indexBiggest] = resultAddition - 10
            memory = 1
        }
        indexSmall--
        indexBiggest--
    }

    if (memory == 0) {
        return biggest
    } else {
        // Есть память
        if (indexBiggest < 0) {
            return addFirstNumberArray(biggest)
        } else {
            while (indexBiggest >= 0) {
                val resultAddition = biggest[indexBiggest] + memory
                if (resultAddition < 10) {
                    biggest[indexBiggest] = resultAddition
                    return biggest
                } else {
                    biggest[indexBiggest] = resultAddition - 10
                    memory = 1
                    indexBiggest--
                }
            }
            return addFirstNumberArray(biggest)
        }
    }
}

fun addFirstNumberArray(j: IntArray): IntArray {
    val newIntArray = IntArray(j.size + 1)
    newIntArray[0] = 1
    for (i in 0..j.lastIndex) {
        newIntArray[i + 1] = j[i]
    }
    return newIntArray
}

fun arrayToInt(j: IntArray): Int {

    var result = 0
    var base = 10.0.pow(j.size.toDouble() - 1).toInt()

    for (i in 0..j.lastIndex) {
        result += j[i] * base
        base /= 10
    }
    return result
}

