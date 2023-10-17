package com.example.kotlinleetcode.easy

import java.util.Stack

fun main() {
    //print( isValid("()[]{}"))
    print( isValid("]"))
}


fun isValid(s: String): Boolean {

    val st = Stack<Char>()
    // open
    val open = arrayOf('{','[','(')
    val memory = HashMap<Char,Char>()
    memory['}'] = '{'
    memory[']'] = '['
    memory[')'] = '('
    // closed

    s.forEach {

        if (open.contains(it)){
            // is open
            st.add(it)
        }else{
            // is closed
            if (st.size == 0){
                return false
            }
            if(st.peek() == memory[it]){
                st.pop()
            }else{
                return false
            }
        }
    }
    return st.size == 0
}





