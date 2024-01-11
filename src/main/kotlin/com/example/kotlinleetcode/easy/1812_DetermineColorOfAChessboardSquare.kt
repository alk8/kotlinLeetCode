package com.example.kotlinleetcode.easy

fun main() {

}

fun squareIsWhite(coordinates: String): Boolean {

    return if(coordinates[0] == 'a' ||
        coordinates[0] == 'c' ||
        coordinates[0] == 'e' ||
        coordinates[0] == 'g' ){

        coordinates[1].toInt() % 2 == 0

    }else{
        coordinates[1].toInt() % 2 != 0
    }

}