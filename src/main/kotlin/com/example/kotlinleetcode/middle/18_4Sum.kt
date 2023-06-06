fun main() {

    //SOLVED

    //println(fourSum(intArrayOf(1,0,-1,0,-2,2),0))
    //println(fourSum(intArrayOf(2,2,2,2,2),8))
    //println(fourSum(intArrayOf(-3,-1,0,2,4,5),0))
    //println(fourSum(intArrayOf(-3,-1,0,2,4,5),2))
    println(fourSum(intArrayOf(1000000000,1000000000,1000000000,1000000000),-294967296))

}

fun fourSum(nums: IntArray,target: Int): List<ArrayList<Int>> {
    // Сортировка массива для метода двух указателей
    nums.sort()
    val result = HashSet<ArrayList<Int>>()
    var begin = 0

    while (begin <= nums.lastIndex -3){
        val const = nums[begin]
        for (i in begin+1..nums.lastIndex-2) {
            // левый указатель
            var l = i + 1
            // правый указатель
            var r = nums.lastIndex

            while (l < r) {
                val sum : Long = nums[l].toLong() + nums[r].toLong() + nums[i].toLong() + const.toLong()
                when {
                    sum > target -> {
                        r--
                    }
                    sum < target -> {
                        l++
                    }
                    else -> {
                        result.add(arrayListOf(nums[l], nums[r], nums[i],const))
                        r--
                        l++
                    }
                }
            }
        }
        begin++
    }
    return result.toList()
}