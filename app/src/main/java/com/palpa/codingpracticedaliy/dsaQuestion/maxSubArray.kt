package com.palpa.codingpracticedaliy.dsaQuestion

fun maxSubArray(nums: IntArray): Int {
    var currentSum = nums[0]
    var maxSum = nums[0]

    for (i in 1 until nums.size) {
        currentSum = maxOf(nums[i], currentSum + nums[i])
        maxSum = maxOf(maxSum, currentSum)
    }

    return maxSum
}
fun main(){
    println(maxSubArray(intArrayOf(-2,1,-3,4,-1,2,1,-5,4))) // 5
    //  println(maxProfit(intArrayOf(7,6,4,3,1)))   // 0
    //println(maxProfit(intArrayOf(1,2,3,4,5)))   // 4
    //println(maxProfit(intArrayOf(5)))
}

fun maxSub(num:IntArray) : Int{
    var currentSum=num[0]
    var maxSum= 0
    for (i in 1 until num.size){
        currentSum = maxOf(num[i],currentSum + num[i])
        maxSum = maxOf(maxSum,currentSum)
    }
    return maxSum
}