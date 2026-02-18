package com.palpa.codingpracticedaliy.string

fun countVowelsAndConsonants(str:String){
    var vowel = 0
    var consol = 0
    for (ch in str.lowercase()){
        if (ch in "aeiou"){
            vowel++
        }else if (ch.isLetter()){
            consol++
        }
    }
    println("Total vowel:$vowel con:$consol")
}