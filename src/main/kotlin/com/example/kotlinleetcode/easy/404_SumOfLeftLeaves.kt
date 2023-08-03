package com.example.kotlinleetcode.easy

import objects.TreeNode

fun main() {

    val tree = TreeNode(3, TreeNode(9), TreeNode(20, TreeNode(15), TreeNode(7)))

    println(sumOfLeftLeaves(tree))
}

fun sumOfLeftLeaves(root: TreeNode?): Int {

    return solve(0, root,false)

}

fun solve(r: Int, tree: TreeNode?,isLeft:Boolean): Int {

    var result = r

    if (tree?.left == null && tree?.right == null && isLeft) {
        result += tree?.`val` ?: 0
    }

    if (tree?.left != null) {
        result = solve(result, tree.left,true)
    }

    if (tree?.right != null) {
        result = solve(result, tree.right,false)
    }

    return result
}