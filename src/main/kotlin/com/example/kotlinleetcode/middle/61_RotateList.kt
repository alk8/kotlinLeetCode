package com.example.kotlinleetcode.middle

fun main() {

    //println(rotateRight(ListNode(0,ListNode(1,ListNode(2))),4))
    println(rotateRight(ListNode(1,ListNode(2,ListNode(3,ListNode(4,ListNode(5))))),2))

}

fun rotateRight(head: ListNode?, k: Int): ListNode? {

    // first need compute a deep listNode
    var node: ListNode? = head
    var deep = 1
    var head2 = head

    while (node?.next != null) {
        deep++
        node = node.next
    }
    // second need divide on a deep. because if deep > k dont need all iteration
    val turns = k % deep
    var previous: ListNode? = null
    node = head
    for (i in 1..turns) {

        while (true) {
            if (node?.next == null) {
                // is deepest
                // delete the last one
                previous?.next = null
                //node?.next = head2
                head2 = ListNode(node?.`val` ?: 0,head2)
                node = head2
                break
            }else {
                previous = node
                node = node.next
            }
        }

    }
    return head2
}
