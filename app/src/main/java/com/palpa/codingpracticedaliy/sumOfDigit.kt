package com.palpa.codingpracticedaliy

fun sumOfDigit(n:Int){
    var num=n
    var sum = 0
    while (num!=0){
        val digit = num % 10
        sum += digit
        num/=10
    }
    println("Sum of digit is :$sum")
}
