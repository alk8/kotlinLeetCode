package com.example.kotlinleetcode.middle

fun main() {

    // SOLVED

    //var l1 = ListNode(9, ListNode(9, ListNode(9, ListNode(9))))
    //var l2 = ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9)))))))
    var l1 = ListNode(2,ListNode(4,ListNode(9)))
    var l2 = ListNode(5,ListNode(6,ListNode(4,ListNode(9))))
    println(addTwoNumbers(l1, l2))

}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {

    val l1size =getSizeListNode(l1)
    val l2size =getSizeListNode(l2)

    if (l1size >= l2size) {
        recursionAddictionListNode(l2,l1, maxDepth = l1size)
        return l1
    } else {
        recursionAddictionListNode(l1,l2, maxDepth = l2size)
        return l2
    }
}
fun getSizeListNode(listNode: ListNode?, count: Int = 1): Int {
    var result = count
    if (listNode?.next != null) {
        result = getSizeListNode(listNode.next, count + 1)
    }
    return result
}

fun recursionAddictionListNode(smallest: ListNode?, biggest: ListNode?, memory: Int = 0,depth: Int = 1,maxDepth: Int) {

    if (biggest != null) {
        val smallestNumber = smallest?.`val` ?: 0
        val biggestNumber = biggest.`val`
        val result = smallestNumber + biggestNumber + memory

        if (result < 10) {
            biggest.`val` = result
            recursionAddictionListNode(smallest?.next, biggest.next, 0,depth+1,maxDepth)
        } else {
            biggest.`val` = result - 10
            recursionAddictionListNode(smallest?.next, biggest.next, 1,depth+1,maxDepth)
            if (depth == maxDepth){
                biggest.next = ListNode(1)
            }
        }
    }
}

fun solveRecursion(
    biggest: ListNode?,
    smallest: ListNode?,
    head: ListNode?,
    depth: Int = 1,
    smallestDepth: Int
): ListNode? {
    var node = head
    if (biggest?.next != null) {
        node = solveRecursion(biggest.next, smallest?.next ?: smallest, node, depth + 1, smallestDepth)
    }
    var smallestNumber = 0
    if (smallestDepth < depth) {
        smallestNumber = smallest?.`val` ?: 0
    }
    val biggestNumber = biggest?.`val` ?: 0
    val result = smallestNumber + biggestNumber + node?.`val`!!

    if (result < 10) {
        node.`val` = result
        if (depth != 1) {
            node.next = ListNode(0)
        }
    } else {
        node.`val` = result - 10
        node.next = ListNode(1)
    }
    return node.next
}

class ListNode(var `val`: Int = 0, var next: ListNode? = null) {

}