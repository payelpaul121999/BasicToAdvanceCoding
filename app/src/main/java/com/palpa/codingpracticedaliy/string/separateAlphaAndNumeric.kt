package com.palpa.codingpracticedaliy.string

fun separateAlphaAndNumeric(input:String){
    val isAlpha= StringBuilder()
    val isDigit= StringBuilder()
    for (ch in input){
        if (ch.isLetter()){
            isAlpha.append(ch)
        }else if (ch.isDigit()){
            isDigit.append(ch)
        }
    }
    println("Alpha $isAlpha isDigit:$isDigit")

}
