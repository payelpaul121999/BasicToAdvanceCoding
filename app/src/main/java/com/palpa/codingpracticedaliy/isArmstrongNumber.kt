package com.palpa.codingpracticedaliy

fun isArmstrongNumber(num:Int){
    val digitsCount = num.toString().length
    var temp = num
    var sum = 0

    while (temp > 0) {
        val digit = temp % 10
        sum += Math.pow(digit.toDouble(), digitsCount.toDouble()).toInt()
        temp /= 10
    }
    if(sum == num){
        println("This is arm Stronge $sum")
    }
}