package com.example.kotlinleetcode.easy

import objects.TreeNode
import kotlin.math.max

fun main() {

}

fun maxDepth(root: TreeNode?): Int {
    if (root == null) return 0
    return recursiveSolution(root,0)
}

fun recursiveSolution(root: TreeNode?, result: Int): Int {

    if (root?.left != null || root?.right != null) {
        val l = recursiveSolution(root.left, result + 1)
        val r = recursiveSolution(root.right, result + 1)
        return max(l,r)
    }
    return result

}