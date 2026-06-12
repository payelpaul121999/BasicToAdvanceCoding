package com.palpa.codingpracticedaliy.dsaQuestion
fun containsDuplicateHastSet(arr:IntArray):Boolean{
    val set = HashSet<Int>()
    for (num in arr){
        if (!set.add(num)){
            return true
        }
    }
    return false
}
fun containsDuplicate(arr:IntArray) : Boolean{
    arr.sort()
    for (i in 1 until arr.size){
        if (arr[i]==arr[i-1]) return true
    }
    return false
}
fun main(){
    val array1 = intArrayOf(1, 2, 3, 4, 5,5,6)
    println("containDuplicate : ${containsDuplicate(array1)}")
    println("containDuplicate Hashset : ${containsDuplicateHastSet(array1)}")


   /* i = 0 → 10
    i = 1 → 20
    i = 2 → 30
    i = 3 → 40*/
    //for (i in num.indices)
       /* i = 0 → 10
        i = 1 → 20
        i = 2 → 30
        i = 3 → 40*/
    // for (i in 1 until arr.size)
       /* i = 1 → compare 10 & 20
        i = 2 → compare 20 & 30
        i = 3 → compare 30 & 40*/

    // for(i in 0 .. arr.size)
       /* i = 0 → 10
        i = 1 → 20
        i = 2 → 30
        i = 3 → 40
        i = 4 → 💥 CRASH*/
}