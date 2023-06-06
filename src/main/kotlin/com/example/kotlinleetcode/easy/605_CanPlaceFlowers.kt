package com.example.kotlinleetcode.easy

fun main() {
    //println(canPlaceFlowers(intArrayOf(1,0,0,0,0,0,0,0,1), 3))
    //println(canPlaceFlowers(intArrayOf(1,0,0,0,0,0,0,0,1), 3))
    //println(canPlaceFlowers(intArrayOf(1,0,1,0,1,0,1), 1))
    //println(canPlaceFlowers(intArrayOf(1,0,0,0,0,1), 2))
    //println(canPlaceFlowers(intArrayOf(0,0,1,0,1), 1))
    println(canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1, 0, 0), 2))
}

fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {

    // nothing to plant
    if (n == 0) return true

    var result = 0
    var index = 0
    var previous = flowerbed[0]
    while (true) {
        if (index + 1 > flowerbed.lastIndex) {

            // for one-place flowerbed
            val lastIndex = index - 1
            if (!flowerbed.indices.contains(lastIndex)){

                // one flower and one place
                if (previous ==0 && n ==1) return true
                break
            }

            // check last position
            if (flowerbed[lastIndex] == 0 && flowerbed[index] == 0) result++
            break
        }

        if (previous != 1 && flowerbed[index + 1] != 1 && flowerbed[index] != 1) {
            // planted
            flowerbed[index] = 1
            result++
        }

        previous = flowerbed[index]
        index++

    }
    return result >= n
}

