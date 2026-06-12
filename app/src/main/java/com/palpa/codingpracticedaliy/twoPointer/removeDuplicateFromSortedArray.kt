package com.palpa.codingpracticedaliy.twoPointer

import com.palpa.codingpracticedaliy.dsaQuestion.maxSubArray

fun removeDuplicateFromSortedArray(num:IntArray):IntArray{
    var left = 0
    for (right in 1 until num.size){
        if (num[right]!=num[left]){
            left++
            num[left] = num[right]
        }
    }
    return num
}

fun main(){
     val k=   removeDuplicateFromSortedArray(intArrayOf(1,1,2,3,3,4,5))
    k.forEach {
        println(k.toString()) // 5
    }
}