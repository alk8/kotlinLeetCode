package com.example.kotlinleetcode.easy

import objects.ListNode

fun main() {
    // SOLVED
}

fun middleNode(head: ListNode?): ListNode? {

    if (head?.next == null) return head

    var deep = 0
    var node = head
    val map : HashMap<Int,ListNode?> = HashMap()

    while (node != null){
        node = node.next
        map.put(deep,node)
        deep++
    }

    return map.get((deep/2)-1)

}

