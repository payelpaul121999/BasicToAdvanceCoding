package com.palpa.codingpracticedaliy.string

import java.lang.StringBuilder

fun freqOfCharacterString(input:String):String{
    var result = StringBuilder()
    var count =1
    for (i in 1 until input.length){
        if (input[i]==input[i-1]){
            count++
        }else{
            result.append(input[i-1]).append(count)
            println("$result")
            count=1
        }
    }
    result.append(input.last()).append(count)
    println("$result")
    return result.toString()
}