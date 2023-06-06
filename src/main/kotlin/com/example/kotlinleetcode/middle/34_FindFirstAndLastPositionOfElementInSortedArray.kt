package com.example.kotlinleetcode.middle

fun main() {

    //println(searchRange(intArrayOf(5,7,7,8,8,10),6).toString())
    //println(searchRange(intArrayOf(5,7,7,8,8,10),8).toString())
    //println(searchRange(intArrayOf(1),1).toString())
    //println(searchRange(intArrayOf(1),0).toString())
    println(searchRange(intArrayOf(2,2),1).toString())

}

fun searchRange(nums: IntArray, target: Int): IntArray {

    if (nums.isEmpty()) return intArrayOf(-1,-1)

    var arr = nums

    while (true) {
        val middle = arr.size / 2
        val value = arr[middle]

        val lArray = arr.copyOfRange(0,middle)
        val rArray = arr.copyOfRange(middle+1,arr.size)

        if (value==target) {
            if (lArray.isEmpty() && rArray.isEmpty()){
                return intArrayOf(middle,middle)
            }
            return intArrayOf(middle,middle+1)
        }

        if (lArray.isEmpty() || rArray.isEmpty()) return intArrayOf(-1,-1)

        arr = if (lArray[lArray.lastIndex] > target && rArray.first() > target){
            return intArrayOf(-1,-1)
        }else if (lArray[lArray.lastIndex] < target){
            lArray
        }else{
            rArray
        }
    }
}
