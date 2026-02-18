package com.palpa.codingpracticedaliy.array

fun searchAnElement(target:Int):Int{
    val arr = arrayOf(10, 2,  2, 5,9)
    for (i in arr.indices){
        if (target == arr[i]){
            return i
        }
    }
    return 0
}