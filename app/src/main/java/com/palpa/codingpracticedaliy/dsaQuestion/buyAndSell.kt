package com.palpa.codingpracticedaliy.dsaQuestion

fun maxProfit(prices: IntArray): Int {
    var minPrice = Int.MAX_VALUE
    println("minPrice $minPrice")
    var maxProfit = 0

    for (price in prices) {
        println("price $price minPrice $minPrice")
        if (price < minPrice) {
            minPrice = price
        } else {
            val profit = price - minPrice
            maxProfit = maxOf(maxProfit, profit)
        }
    }

    return maxProfit
}

fun maxProfits(prices: IntArray):Int {
    var minPrice=Int.MAX_VALUE
    var maxProfit=0
    for (price in prices){
        if (price < minPrice){
            minPrice=price
        }else{
            val profit = price - minPrice
            maxProfit = maxOf(maxProfit,profit)
        }
    }
    return maxProfit
}

fun findMaxProfit(prices:IntArray):Int{
    var minPrice=Int.MAX_VALUE
    var maxProfit=0
    for (price in prices){
        if (price < minPrice){
            minPrice = price
        }else{
            val profit = price- minPrice
            maxProfit = maxOf(maxProfit,profit)
        }
    }
    return maxProfit

}
fun main(){
    println(maxProfit(intArrayOf(7,1,5,3,6,4))) // 5
  //  println(maxProfit(intArrayOf(7,6,4,3,1)))   // 0
    //println(maxProfit(intArrayOf(1,2,3,4,5)))   // 4
    //println(maxProfit(intArrayOf(5)))
}

