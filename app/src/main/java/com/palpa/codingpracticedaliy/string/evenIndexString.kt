package com.palpa.codingpracticedaliy.string

fun evenIndexString(str:String)
{
    for (i in 0 until str.length-1){
        if (i % 2 == 0){
            print("${str[i]}  ")
        }
    }
}