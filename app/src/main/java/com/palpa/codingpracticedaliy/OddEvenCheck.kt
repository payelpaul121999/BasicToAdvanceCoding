package com.palpa.codingpracticedaliy

import com.palpa.codingpracticedaliy.string.areAnagram
import com.palpa.codingpracticedaliy.string.countVowelsAndConsonants
import com.palpa.codingpracticedaliy.string.evenIndexString
import com.palpa.codingpracticedaliy.string.isPalindromeString
import com.palpa.codingpracticedaliy.string.printUniqueChars
import com.palpa.codingpracticedaliy.string.removeSpace
import java.lang.StringBuilder


fun oddEvenCheck(){
    val num=9
    if(num % 2 == 0){
        println("$num Number is Even")
    }else{
        println("$num Number is Odd")
    }
}


fun main(){
   // println("this prime Number ${ findPrimeNumber()}")
    println("this  number of digit ${ numberOfDigit()}")
    //findPrimeNumber()
    //swapTwoNumberWithOutThird()
    //factorialNumber()
    //println("this is the reverse num: ${reverseNumber(567)}")
    //isArmstrongNumber(153)
    //isPalindromeNu(121)
    sumOfDigit(5677)
    //println("Reserve String ${reserveEachString("payel is not availble")}")
    evenIndexString("kolkata")
    println("${removeSpace("this id")}")
}










