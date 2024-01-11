package com.example.kotlinleetcode.easy

import objects.TreeNode

fun main() {

}

fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
    return rec(root,low,high,0)
}

fun rec(root: TreeNode?,low:Int,high:Int,result:Int):Int{

    var r = result

    if (root!!.`val` in low..high){
        r +=root.`val`
    }

    if (root.left != null) {
        r = rec(root.left,low,high,r)
    }

    if (root.right != null) {
        r = rec(root.right,low,high,r)
    }

    return r
}