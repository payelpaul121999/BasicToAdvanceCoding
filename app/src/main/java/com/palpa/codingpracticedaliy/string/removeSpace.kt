package com.palpa.codingpracticedaliy.string

import java.lang.StringBuilder

fun removeSpace(text:String):String{
    val result = StringBuilder()
    for(i in text){
        if (i !=' '){
            result.append(i)
        }
    }
    return result.toString()
}
 fun twiceCharacter(text:String){
     val result = StringBuilder()
     for (i in text){
         result.append(i).append(i)
     }
     println("$result")
 }
fun main(){
    swapWithoutThirdVariable()
}
fun swapWithoutThirdVariable(){
    var a ="hello"
    var b ="world"
    a = a + b
    b =a.substring(0,a.length - b.length)
    a=a.substring(b.length)
    println("$a $b")

}