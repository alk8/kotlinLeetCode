package com.example.kotlinleetcode.easy

fun main() {
    // SOLVED
}

fun romanToInt(s: String): Int {

    val data = HashMap<Char,Int>()
    data['I'] = 1
    data['V'] = 5
    data['X'] = 10
    data['L'] = 50
    data['C'] = 100
    data['D'] = 500
    data['M'] = 1000

    var previous = 0
    var result = 0

    for (c in s.toCharArray()){

        if (previous == 1 && c== 'V'){
            result += 4 - previous
        }else if (previous == 1 && c=='X'){
            result += 9 - previous
        }else if (previous == 10 && c =='L'){
            result += 40 - previous
        }else if (previous == 10 && c =='C'){
            result += 90 - previous
        }else if (previous == 100 && c =='D'){
            result += 400 - previous
        }else if (previous == 100 && c =='M'){
            result += 900 - previous
        }else{
            result += data.getValue(c)
        }
        previous = data.getValue(c)
    }
    return result
}