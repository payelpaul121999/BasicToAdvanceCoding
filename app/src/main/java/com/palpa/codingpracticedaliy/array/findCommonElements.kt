package com.palpa.codingpracticedaliy.array

fun main() {
    val array1 = intArrayOf(1, 2, 3, 4, 5)
    val array2 = intArrayOf(4, 5, 6, 7, 8)

    val result = findCommonElements(array1, array2)
    println("Common elements: $result") // [4, 5]
}
/**“I store the first array in a HashSet for O(1) lookup, then scan the second array to collect matches*/
fun findCommonElements(array:IntArray,second:IntArray):Set<Int>{
    val set = HashSet<Int>()
    val commonSet = HashSet<Int>()
    for (num in array){
        set.add(num)
    }
    for (num in second){
        for (num in set){
            commonSet.add(num)
        }
    }

    println("Common element : ${commonSet}")
    return commonSet
}