package com.palpa.codingpracticedaliy

fun fibonacciSeries(){
    var first = 0
    var second = 1
    var next = 0
    val number = 9
    println("Fibo series:")

    for (i in 1..number){
        print("$first ")
        next = first + second
        first = second
        second = next
    }
}