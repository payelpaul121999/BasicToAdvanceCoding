package com.palpa.codingpracticedaliy.string

fun rearrangeDigits(input:String){
    val isDigit= StringBuilder()
    val isNonDigit = StringBuilder()
    for (ch in input){
        if (ch.isDigit()){
            isDigit.append(ch)
        }else
        {
            isNonDigit.append(ch)
        }
    }
    println("rearrange : $isDigit$isNonDigit")
}
fun main(){
    moveAllZeroToFront("980988700")
    //Alpha aABc isDigit:098
}

fun moveZerosToEnd(input: String): String {
    val nonZero = StringBuilder()
    var zeroCount = 0

    for (ch in input) {
        if (ch == '0') zeroCount++
        else nonZero.append(ch)
    }

    repeat(zeroCount) { nonZero.append('0') }
    println("This is  $nonZero")
    return nonZero.toString()
}

fun removeZeroToEnd(input:String){
    val nonZero = StringBuilder()
    var zeroCount = 0
    for (ch in input){
        if (ch == '0'){
            zeroCount++
        }else{
            nonZero.append(ch)
        }
    }
    repeat(zeroCount){
        nonZero.append('0')
    }
    println("$nonZero")
}

fun moveAllZeroToFront(input:String){
  val nonZero=StringBuilder()
  var zeroCount=0
  for (ch in input){
      if (ch=='0'){
          zeroCount++
      }else{
          nonZero.append(ch)
      }
  }
    val zeroDigit = StringBuilder()
    repeat(zeroCount){
      zeroDigit.append('0')
    }
    println("this is $zeroDigit$nonZero")
}