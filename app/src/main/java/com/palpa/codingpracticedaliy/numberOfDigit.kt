package com.palpa.codingpracticedaliy

fun numberOfDigit():Int{
    var n =1234567
    var count = 0
    do {
        count++
        n /= 10
    }while (n!=0)
    return count
}