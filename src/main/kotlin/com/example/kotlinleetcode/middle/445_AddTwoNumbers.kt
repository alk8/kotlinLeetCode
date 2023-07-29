package com.example.kotlinleetcode.middle

fun main() {

    val a = ListNode(7, ListNode(2, ListNode(4, ListNode(3))))
    val b = ListNode(5, ListNode(6, ListNode(4)))
    addTwoNumbers(a, b)

}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {


    // first need to understand, which on of list node larger
    // recursion
    solve(l1, l2, 1, 1)



    return null


}

fun solve(l1: ListNode?, l2: ListNode?, deep1: Int, deep2: Int): Pair<Int, ListNode?> {

    var deepl1 = deep1
    var deepl2 = deep2
    var mem = 0
    var mainLine: ListNode? = null
    var l1r = l1
    var l2r = l2

    if (l1r?.next != null || l2r?.next != null) {

        val first = if (l1r?.next == null) {
            l1r
        } else {
            deepl1++
            l1r.next
        }

        val second = if (l2r?.next == null) {
            l2
        } else {
            deepl2++
            l2r.next
        }

        solve(first, second, deepl1, deepl2).also { pair ->
            mem = pair.first
            mainLine = pair.second
        }
    }

    // who is bigger
    if (mainLine == null) {
        mainLine = if (deep1 > deep2) {
            l1r
        } else {
            l2r
        }
    }

    val sum = (l1r?.`val` ?: 0) + (l2r?.`val` ?: 0) + mem

    return if (sum > 9) {
        mainLine?.`val` = sum - 10
        1 to mainLine
    } else {
        mainLine?.`val` = sum
        0 to mainLine
    }

}