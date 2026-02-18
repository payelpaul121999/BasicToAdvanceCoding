package com.palpa.codingpracticedaliy

fun isPalindromeNu(num:Int){
    val temp = num
    var n = num
    var reverse = 0
    while (n!=0){
        val digit = n % 10
        reverse = reverse * 10 + digit
        n/=10
    }
    if (temp==reverse){
        println("number is isPalindrome $reverse $num")
    }
    println()
}