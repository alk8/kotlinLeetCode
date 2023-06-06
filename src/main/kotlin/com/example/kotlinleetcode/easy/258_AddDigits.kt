package com.example.kotlinleetcode.easy

fun main() {
    println(addDigits(38))
}

fun addDigits(num: Int): Int {

    var result = 0
    var _num = num
        
    while(true){
        result+= _num % 10
        _num = _num/10

        if (_num == 0){

            if (result > 9){
                _num = result
                result = 0
                continue
            }else {
                break
            }
        }
    }
    return result
}