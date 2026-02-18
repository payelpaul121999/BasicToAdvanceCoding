package com.palpa.codingpracticedaliy.array

fun selectionSort(array: IntArray) {
    val n = array.size

    for (i in 0 until n - 1) {
        var minIndex = i

        for (j in i + 1 until n) {
            if (array[j] < array[minIndex]) {
                minIndex = j
            }
        }

        // swap
        val temp = array[i]
        array[i] = array[minIndex]
        array[minIndex] = temp
    }
}

fun main() {
    val arr = intArrayOf(64, 25, 12, 22, 11)
    selectionSort(arr)
    println(arr.joinToString()) // 11, 12, 22, 25, 64
}