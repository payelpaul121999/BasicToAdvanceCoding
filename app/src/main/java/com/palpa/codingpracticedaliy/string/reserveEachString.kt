package com.palpa.codingpracticedaliy.string

fun reserveEachString(input:String):String{
    val words=input.split(" ")
    var reverseString =""
    for (word in words){
        var reverseWord=""
        for (ch in word){
            reverseWord=ch+reverseWord
        }
        reverseString +="$reverseWord "
    }
    return reverseString
}