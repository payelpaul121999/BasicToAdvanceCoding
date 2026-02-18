package com.palpa.codingpracticedaliy.array

fun removeDuplicateForArray(arr: Array<Int>){
    if (arr.isEmpty()) return
    val hashSet = HashSet<Int>()
    for (num in  arr){
        hashSet.add(num)
    }
    println("This is hash set :$hashSet")
}
fun main(){
    val arr = arrayOf(10, 2,  -3, 5,5,9,9)
    //val arr = arrayOf(1, 2, 2, 3, 4, 4, 5)
    //removeDuplicateForArray(arr)
    //findMissingNumber(arr)
    //findLargestAndSmallest(arr)
    //println("this is the searching element: ${searchAnElement(5)}")

   // val arr = arrayOf("10", "@", "20", "#", "30")
    //println(sumOnlyInteger(arr))  // 60
    findNonRepeatedElements(arr)

}

fun findNonRepeatedElements(arr:Array<Int>){
    val frequencyMap= mutableMapOf<Int,Int>()
    for (num in arr){
        frequencyMap[num] = frequencyMap.getOrDefault(num,0) + 1
    }
    val nonRepeated = mutableListOf<Int>()

    for((key,value )in frequencyMap){
        if (value==1){
            nonRepeated.add(key)
        }
    }
    println("printed :$nonRepeated")
}

