package com.example.kotlinleetcode.easy

import objects.TreeNode

fun main() {
// SOLVED
}

fun invertTree(root: TreeNode?): TreeNode? {
    solve(root)
    return root
}

fun solve(root: TreeNode?) {

    if (root?.left == null && root?.right == null) return

    val r = root.left
    root.left = root.right
    root.right = r

    solve(root.left)
    solve(root.right)
}

