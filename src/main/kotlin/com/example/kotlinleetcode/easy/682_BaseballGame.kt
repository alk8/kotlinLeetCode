package com.example.kotlinleetcode.easy

import java.util.*

fun main() {
// SOLVED
}

fun calPoints(operations: Array<String>): Int {
    val stk = Stack<Int>()
    for (s in operations){
        when (s) {
            "C" -> stk.pop()
            "D" -> stk.push(stk.peek()*2)
            "+" -> stk.push(stk[stk.size-1] + stk[stk.size-2])
            else -> stk.push(Integer.parseInt(s))
        }
    }
    return stk.sum()
}