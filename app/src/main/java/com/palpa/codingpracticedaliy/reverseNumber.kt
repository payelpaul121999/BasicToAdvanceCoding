package com.palpa.codingpracticedaliy

fun reverseNumber(num:Int):Int{
    var n=num
    var reverse=0
    while (n!=0){
        val digit = n % 10
        println("this is the reverse digit: $digit")

        reverse = reverse * 10 + digit
        println("this is the reverse reverse: $reverse")

        n /= 10
        println("this is the reverse n: $n")

    }
    return reverse
}
fun main(){
    reverseNumber(987)
}