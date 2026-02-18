package com.palpa.codingpracticedaliy

fun swapTwoNumberWithOutThird(){
    var a=5
    var b=10
    a=a+b
    b=a-b
    a=a-b
    println("after swapping a=$a b=$b")

//using xor operation
    println("before swapping a=$a b=$b")

    a = a xor b
    b = a xor b
    a = a xor b
    println("After swapping a=$a b=$b")

}