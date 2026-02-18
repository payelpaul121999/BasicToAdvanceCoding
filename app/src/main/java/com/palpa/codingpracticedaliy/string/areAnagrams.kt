package com.palpa.codingpracticedaliy.string

import java.lang.StringBuilder

fun areAnagram(a:String,b:String):Boolean{
    if (a.length!=b.length) return false
    val counts = IntArray(256)
    for (i in a.indices){
        counts[a[i].code]++
        counts[a[i].code]--
    }
    return counts.all { it==0 }
}


fun freqOfCharacter(input:String):String{
    if (input.isEmpty()) return ""
    val result =StringBuilder()
    var count = 1
    for (i in 1 until input.length){
        if (input[i]==input[i-1]){
            count++
        }else{
            result.append(input[i-1]).append(count)
            count = 1
        }
    }
    result.append(input.last()).append(count)
    return result.toString()
}




fun main() {
    val input = "aabbcccdd"
    println(freqOfCharacter(input)) //a2b2c3d2
}