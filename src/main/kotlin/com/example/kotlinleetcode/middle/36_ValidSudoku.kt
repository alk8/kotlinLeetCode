package com.example.kotlinleetcode.middle

fun main() {
   // SOLVED
}

fun isValidSudoku(board: Array<CharArray>): Boolean {

    for (x in 0..8) {
        for (y in 0..8) {
            if (board[x][y] == '.') continue
            if (checkRow(x,y,board)||checkColumn(x,y,board)||checkMatrix(x,y,board)) return false
        }
    }
    return true
}

private fun checkRow(x: Int, y: Int, board: Array<CharArray>): Boolean {

    for (i in 0..8) {
        if (x == i) continue
        if (board[x][y] == board[i][y]) return true
    }
    return false
}

private fun checkColumn(x: Int, y: Int, board: Array<CharArray>) :Boolean{

    for (i in 0..8) {
        if (y == i) continue
        if (board[x][y] == board[x][i]) return true
    }
    return false
}

private fun checkMatrix(x: Int, y: Int, board: Array<CharArray>):Boolean {

    for (i in getInterval(x)) {
        for (j in getInterval(y)) {
            if (i==x && j==y) continue
            if (board[i][j] == board[x][y]) return true
        }
    }
    return false
}

private fun getInterval(i : Int):IntRange{

    return when (i) {
        in 0..2 -> {
            0..2
        }
        in 3..5 -> {
            3..5
        }
        else -> {
            6..8
        }
    }
}