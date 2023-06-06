package com.example.kotlinleetcode.easy

fun main(){

    //removeDuplicates(intArrayOf(1,1,1,2,2,3,4,5,5,5,6,7,7,9,24,25,27,37))
    print(removeDuplicates(intArrayOf(1,1,2)))

}

fun removeDuplicates(nums: IntArray): Int {

    var result = 0

    var i = 0
    var j = 1
    while (i <= nums.lastIndex){

        if (j > nums.lastIndex) break
        if (nums[i] == nums[j]) {
            j++
            continue
        }
        result ++
        i = j
    }
    return result + 1
}