package com.example.kotlinleetcode.middle

fun main() {
    //arrayChange(intArrayOf(1,2,4,6), arrayOf(intArrayOf(1,3), intArrayOf(4,7), intArrayOf(6,1)))
    arrayChange(intArrayOf(1,2), arrayOf(intArrayOf(1,3), intArrayOf(2,1), intArrayOf(3,2)))
}

fun arrayChange(nums: IntArray, operations: Array<IntArray>): IntArray {

    val memory = HashMap<Int,Int>()

    // fill memory
    nums.forEachIndexed{value: Int, key: Int -> memory[key] = value }

    //change values in
    operations.forEach { ints ->

        val key = ints[0]
        memory[key]?.let { nums.set(it,ints[1]) }

        memory.remove(key)?.let {
            memory.put(ints[1], it)
        }

    }
    
    return nums
}