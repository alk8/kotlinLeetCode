package com.example.kotlinleetcode

fun main() {

    //println(findKthPositive(intArrayOf(2,3,4,7,11),5))
    //println(findKthPositive(intArrayOf(1,2,3,4),2))
    //println(findKthPositive(intArrayOf(5,6,7,8,9),9))

}

fun findKthPositive(arr: IntArray, k: Int): Int {

    // SOLVED
    val missingNumbers = ArrayList<Int>()
    var first = 1

    while (arr[0] != first){
        missingNumbers.add(first)
        first++
        if (missingNumbers.size == k){
            return missingNumbers.get(missingNumbers.lastIndex)
        }
    }

    for (i in 0..arr.lastIndex) {
        if (i == arr.lastIndex){
            break
        }
        if (arr[i]+1 != arr[i + 1]) {
            var probablyNumber = arr[i]+1
            while (probablyNumber < arr[i+1]){
                missingNumbers.add(probablyNumber)
                probablyNumber++
                if (missingNumbers.size == k){
                    return missingNumbers.get(missingNumbers.lastIndex)
                }
            }
        }
    }

    if (missingNumbers.isEmpty()) return arr[arr.lastIndex] + k
    if (missingNumbers.size < k) return arr[arr.lastIndex] + k - missingNumbers.size
    return missingNumbers[k-1]
}