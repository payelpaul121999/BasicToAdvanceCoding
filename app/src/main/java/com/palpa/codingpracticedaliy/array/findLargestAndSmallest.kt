package com.palpa.codingpracticedaliy.array

fun findLargestAndSmallest(num:Array<Int>){
    if (num.isEmpty()) return
    var largest=num[0]
    var smallest=num[0]
    for (i in 1 until num.size){
        if (num[i] < smallest){
            smallest = num[i]
        }
        if (num[i]>largest){
            largest = num[i]
        }
    }
    println("this is largest:$largest smallest :$smallest")
}