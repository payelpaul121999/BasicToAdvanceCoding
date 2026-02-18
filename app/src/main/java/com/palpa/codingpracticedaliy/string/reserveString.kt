package com.palpa.codingpracticedaliy.string

fun reserveString(text:String):String{
    var result =""
    for (i in text.length-1 downTo 0){
        result += text[i]
    }
    return result
}