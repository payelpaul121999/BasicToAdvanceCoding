package com.palpa.codingpracticedaliy.string

fun isPalindromeString(str:String):Boolean{
    var left = 0
    var right = str.length - 1
    while (left<right){
        if (str[left]!=str[right]){
            return false
        }
        left++
        right--
    }
    return true
}