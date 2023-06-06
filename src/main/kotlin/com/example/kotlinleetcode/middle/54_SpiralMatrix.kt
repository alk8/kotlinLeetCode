package com.example.kotlinleetcode.middle

fun main() {

    spiralOrder(arrayOf(intArrayOf(1,2,3), intArrayOf(5,6,7), intArrayOf(9,10,11)))
    //spiralOrder(arrayOf(intArrayOf(2,3,4), intArrayOf(5,6,7), intArrayOf(8,9,10),intArrayOf(11,12,13),intArrayOf(14,15,16)))
        // spiralOrder(arrayOf( intArrayOf(6,9,7)))
    //spiralOrder(arrayOf(intArrayOf(1,2,3,4,5,6,7,8,9,10),intArrayOf(11,12,13,14,15,16,17,18,19,20)))

}


fun spiralOrder(matrix: Array<IntArray>): List<Int> {

    val result = ArrayList<Int>()
    var m = 0
    var n = 0
    var endRight = matrix[0].lastIndex
    var endBottom = matrix.lastIndex

    if (endBottom==0){
        return matrix[0].asList()
    }

    if (endRight == 0){
        for (i in 0.. endBottom){
            result.add(matrix[i][0])
        }
        return result
    }

    var endLeft = 0
    var endUp = 0
    var changes = false
    val i = matrix.size * matrix[0].size

    while (true) {

        // right
        while (n < endRight){
            if (result.size < i) result.add(matrix[m][n])
            n++
            changes = true
        }

        // down
        while (m < endBottom){
            if (result.size < i) result.add(matrix[m][n])
            m++
            changes = true
        }

        //left
        while (endLeft < n){
            if (result.size < i) result.add(matrix[m][n])
            n--
            changes = true
        }

        //up
        while (endUp < m){
            if (result.size < i) result.add(matrix[m][n])
            m--
            changes = true
        }

        if (!changes){
            if (result.size < i) result.add(matrix[m][n])
            return result.subList(0,i)
        }

        changes = false

        m++
        n++
        endRight--
        endBottom--
        endLeft++
        endUp++

    }
}

