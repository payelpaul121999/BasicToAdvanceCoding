package com.palpa.codingpracticedaliy.string

fun countCharacters(text:String){
    val counts= mutableMapOf<Char,Int>()
    for (ch in text){
        if (ch==' ') continue
        counts[ch]=counts.getOrDefault(ch,0) + 1
    }
    for ((char,int) in counts){
        println("$char:$int")
    }
}