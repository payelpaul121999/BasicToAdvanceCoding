package com.palpa.codingpracticedaliy.string

fun main(){
    longSubString("kklms")
    longestSubString("kklms")
    //answer is 4 [klms]
}
/*val s1 = "abcabcbb"
val s2 = "bbbbb"
val s3 = "pwwkew"
val s4 = ""

println("s1 → ${longestSubString(s1)}") // 3
println("s2 → ${longestSubString(s2)}") // 1
println("s3 → ${longSubString(s3)}") // 3
println("s4 → ${longSubString(s4)}") // 0*/
fun longSubString(input:String) {
    val seen= HashSet<Char>()
    var maxLength = 0
    var left =0
    var right =0
    while (right < input.length){
        val ch = input[right]
        if (ch !in seen){
            seen.add(ch)
            maxLength = maxOf(maxLength,  right - left +1 )
            right++
        }else{
            seen.remove(input[left])
            left++
        }
    }
    println("max lenghth is  $maxLength")
}

fun longestSubString(s:String){
    val seen =HashSet<Char>()
    var maxLength = 0
    var start =0
    var end = 0
    while (end < s.length){
        val ch = s[end]
        if (ch !in seen){
            seen.add(ch)
            maxLength = maxOf(maxLength,end-start + 1)
            end++
        }else{
            seen.remove(ch)
            start++
        }
    }
    println("max lenghth is  $maxLength")


}