package com.palpa.codingpracticedaliy

fun factorialNumber(){
    var factor =1
    val givenNumber = 3
    for (i in 1..givenNumber){
        factor = factor * i
    }
    println("factorial number:$factor")
}