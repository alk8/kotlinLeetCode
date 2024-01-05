package com.example.kotlinleetcode.easy

fun main() {

    println(totalMoney(4))
    println(totalMoney(10))


}

private const val DAYS = 7

fun totalMoney(n: Int): Int {

    // linear progression (N+1)*N/2
    // every iteration just 7 * iteration
    var j = 0
    var res = 0
    var s = n

    do {
        res += if (s < DAYS){
            ((s+1) * s/2) + (s * j)
        }else{
            ((DAYS+1) * DAYS/2) + (DAYS * j)
        }
        j++
        s -= DAYS

    }while (s > 0)

    return res

}