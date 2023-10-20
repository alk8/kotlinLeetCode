package com.example.kotlinleetcode.easy

import objects.TreeNode

fun main() {

}

fun inorderTraversal(root: TreeNode?): List<Int> {

    val result = ArrayList<Int>()
    val lefts = ArrayList<Int>()
    val rights = ArrayList<Int>()

    if (root == null){
        return result
    }else{
        result.add(root.`val`)
    }

    solve(root,lefts,rights)
    return result + lefts + rights

}

fun solve(tree: TreeNode?, lefts: ArrayList<Int>,rights: ArrayList<Int>){

    if (tree?.left != null){
        lefts.add(tree.left!!.`val`)
        solve(tree.left,lefts,rights)
    }

    if (tree?.right != null){
        rights.add(tree.right!!.`val`)
        solve(tree.right,lefts,rights)
    }

}
