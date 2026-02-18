package com.palpa.codingpracticedaliy.string

fun printUniqueChars(str:String){
    val seen = mutableSetOf<Char>()
    for (ch in str){
        if (seen.add(ch)){
            print("$ch")
        }
    }
}