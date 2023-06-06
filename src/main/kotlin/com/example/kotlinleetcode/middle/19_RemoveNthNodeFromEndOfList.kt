package com.example.kotlinleetcode.middle

import objects.ListNode

// SOLVED
fun main() {
    //removeNthFromEnd(ListNode(1),1)
    removeNthFromEnd(ListNode(1, ListNode(2)),2)
    //removeNthFromEnd(ListNode(1, ListNode(2,ListNode(3, ListNode(4, ListNode(5))))),2)
}

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    val count = recursion(head,n)
    if (count == 1) return null
    if (count == n) return head?.next
    return head
}

fun recursion(head: ListNode?,n: Int): Int {
    var count = 0
    if (head?.next != null) count = recursion(head.next,n)
    if (count == n) head?.next = head?.next?.next
    return count+1
}

