package com.example.kotlinleetcode.easy

fun main() {

}

fun checkStraightLine(coordinates: Array<IntArray>): Boolean {

    if (coordinates.size < 2) return true

    coordinates.forEachIndexed { index, _ ->
        if (index < coordinates.lastIndex - 1) {

            if ((coordinates[index][0] * coordinates[index][1]) % 2 !=
                    (coordinates[index + 1][0] * coordinates[index + 1][1]) % 2) return false

        }
    }
    return true
}