package com.example.kotlinleetcode.easy

fun main() {
    // SOLVED
}

fun plusOne(digits: IntArray): IntArray {

    var last = digits.size-1
    while (true){
        if (last<0){
            val array = IntArray(digits.size+1)
            array[0] = 1;
            var it = 1;
            for (i in digits){
                array[it] = i;
                it++;
            }
            return array
        }

        if (digits[last]+1 <= 9){
            digits[last] = digits[last] + 1
            break
        }
        digits[last] = 0
        last--
    }

    return digits
}