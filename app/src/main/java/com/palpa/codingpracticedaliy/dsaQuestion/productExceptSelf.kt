package com.palpa.codingpracticedaliy.dsaQuestion
//nums = [1, 2, 3, 4]
//
//Now compute:
//
//👉 Index 0 (value = 1)
//Ignore 1
//Multiply others: 2 × 3 × 4 = 24
//👉 Index 1 (value = 2)
//Ignore 2
//Multiply: 1 × 3 × 4 = 12
//👉 Index 2 (value = 3)
//Ignore 3
//Multiply: 1 × 2 × 4 = 8
//👉 Index 3 (value = 4)
//Ignore 4
//Multiply: 1 × 2 × 3 = 6

//[24,12,8,6]
fun productExceptSelf(num:IntArray):IntArray{
    val result = IntArray(num.size)
    var productSum=1
    var zeroCount = 0
    for (i in num){
        if (i==0){
            zeroCount++
        }else{
            productSum *= i
        }
    }
    for (i in num.indices){
        result[i]=when{
            zeroCount > 1 ->0
            zeroCount == 1 && num[i]!=0 -> 0
            zeroCount == 1 && num[i] == 0 -> productSum
            else -> productSum / num[i]
        }
    }

    return result


}
fun main(){
    val arr = intArrayOf(1, 2, 3, 4)

    val result = productExceptSelf(arr)

    println("Result: ${result.contentToString()}")
}