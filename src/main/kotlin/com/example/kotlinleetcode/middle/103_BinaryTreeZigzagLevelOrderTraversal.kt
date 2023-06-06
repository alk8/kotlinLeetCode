package com.example.kotlinleetcode.middle

import objects.TreeNode
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    // SOLVED
}

fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
    return solve(arrayListOf<LinkedList<Int>>(), root)
}

fun solve(result: ArrayList<LinkedList<Int>>, root: TreeNode?, deep: Int = 0): ArrayList<LinkedList<Int>> {

    if (root != null) {

        if (!result.indices.contains(deep)) result.add(LinkedList<Int>())

        if (deep % 2 == 0) {
            result[deep].add(root.`val`)
        } else {
            result[deep].addFirst(root.`val`)
        }
        solve(result, root.left, deep + 1)
        solve(result, root.right, deep + 1)
    }

    return result
}