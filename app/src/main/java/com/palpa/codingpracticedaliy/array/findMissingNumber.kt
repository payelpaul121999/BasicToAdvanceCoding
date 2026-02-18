package com.palpa.codingpracticedaliy.array

fun findMissingNumber(arr:Array<Int>){
    val n=arr.size + 1
    val expectedSum = n*(n+1)/2
    val sum = arr.sum()
    val actualNum=expectedSum-sum
    println("This is the missingNumber $actualNum")
}