package com.example.kotlinleetcode.easy

fun main() {

    hammingDistance(1,4)

}

fun hammingDistance(x: Int, y: Int): Int {

    var z: Int = x xor y
    var bits = 0

    while (z > 0) {
        bits += z and 1
        z = z shr 1
    }

    return bits
}