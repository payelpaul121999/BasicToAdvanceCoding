package com.palpa.codingpracticedaliy.string

fun duplicateCharactersFrom(text:String){
    val counts = mutableMapOf<Char, Int>()
    for (ch in text){
        if (ch == ' ') continue
        counts[ch] = counts.getOrDefault(ch,0) + 1
    }
    println("Duplicate Ch:")
    for ((char,int) in counts){
        if (int > 1){
            println("$char : $int")
        }
    }
}


fun duplicateStringCount(text:String){
    val counts = mutableMapOf<Char,Int>()
    for (ch in text){
        if(ch==' ') continue
        counts[ch]=counts.getOrDefault(ch,0) + 1
    }
    for ((char,int) in counts){
        println("$char : $int")
    }
}


