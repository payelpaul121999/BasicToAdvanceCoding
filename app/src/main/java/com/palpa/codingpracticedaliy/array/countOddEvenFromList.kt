package com.palpa.codingpracticedaliy.array

fun countOddEvenFromList(arr: Array<Int>){
    var countOdd = 0
    var countEven = 0
    for (item in arr){
        if (item % 2 == 0){
            countEven++
        }else{
            countOdd++
        }
    }
    println("This is the Odd count $countOdd event count:$countEven ")
}