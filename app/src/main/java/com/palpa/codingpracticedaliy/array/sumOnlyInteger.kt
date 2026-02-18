package com.palpa.codingpracticedaliy.array

fun sumOnlyInteger(arr:Array<String>):Int{
    var sum = 0
    for (item in arr){
        val number=item.toIntOrNull()
        if (number !=null){
            sum +=number
        }
    }
    println("this is the Total Sum:$sum")
    return sum
}