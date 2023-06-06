package com.example.kotlinleetcode.middle

fun main() {
    //SOLVED
    println(threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)))

}


fun threeSum(nums: IntArray): List<ArrayList<Int>> {
    // Сортировка массива для метода двух указателей
    nums.sort()

    val result = HashSet<ArrayList<Int>>()
    for (i in 0..nums.size - 2) {
        // левый указатель
        var l = i + 1
        // правый указатель
        var r = nums.lastIndex

        while (l < r) {
            val sum = nums[l] + nums[r] + nums[i]
            when {
                sum > 0 -> {
                    r--
                }
                sum < 0 -> {
                    l++
                }
                else -> {
                    result.add(arrayListOf(nums[l], nums[r], nums[i]))
                    r--
                    l++
                }
            }
        }
    }
    return result.toList()
}






