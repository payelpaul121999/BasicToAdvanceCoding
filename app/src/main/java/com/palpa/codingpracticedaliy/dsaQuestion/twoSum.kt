package com.palpa.codingpracticedaliy.dsaQuestion

import java.util.HashMap

fun twoSum(array: IntArray,target:Int):IntArray{
    val hashMap = HashMap<Int,Int>()
    for (i in array.indices){
        val complement = target - array[i]
        if (hashMap.containsKey(complement)){
            return intArrayOf(array[i],i)
        }
        hashMap[array[i]] =i
    }
    return intArrayOf()
}

fun main(){
    val array1 = intArrayOf(1, 2, 3, 4, 5,6)

    println("two Sum : ${twoSumProblem(array1,7).contentToString()}")
}


fun twoSumProblem(num:IntArray,target: Int):IntArray{
    val map = HashMap<Int,Int>()
    for (i in num.indices){
        val complement = target - num[i]
        if (map.containsKey(complement)){
            return intArrayOf(num[i],i)
        }
        map[num[i]] = i
    }
    return intArrayOf()
}