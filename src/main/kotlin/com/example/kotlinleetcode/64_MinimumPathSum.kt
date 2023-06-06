package com.example.kotlinleetcode

fun main() {

    var c = exmpl()
    //println(c.minPathSum(arrayOf(intArrayOf(1,3,1), intArrayOf(1,5,1), intArrayOf(4,2,1))))
    println(c.minPathSum(arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6))))
}

class exmpl {

    var result = -1
    var m: Int = 0
    var n: Int = 0
    var arr: Array<IntArray> = arrayOf()

    fun minPathSum(grid: Array<IntArray>): Int {

        if (grid.isEmpty()) return 0
        m = grid[0].lastIndex
        n = grid.lastIndex
        arr = grid
        solve(0, 0, arr[0][0])
        return result
    }

    private fun solve(x: Int, y: Int, sum: Int) {
        if (x == n && y == m) {
            // Последняя ячейка
            if (result == -1 || sum < result) result = sum
        } else {
            if (x < n) solve(x + 1, y, sum + arr[x + 1][y])
            if (y < m) solve(x, y + 1, sum + arr[x][y + 1])
        }
    }
}





