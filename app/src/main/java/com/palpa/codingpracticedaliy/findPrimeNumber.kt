package com.palpa.codingpracticedaliy

fun findPrimeNumber():Boolean{
    val num = 11
    for (i in 2..num/2){
        if (num % i == 0){
            return false
        }else{
            return true
        }
    }
    return true
}