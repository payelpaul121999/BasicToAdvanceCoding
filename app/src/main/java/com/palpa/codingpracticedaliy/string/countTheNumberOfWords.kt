package com.palpa.codingpracticedaliy.string

fun countTheNumberOfWords(input: String): Int {

    if (input.isBlank()) return 0

    var count = 1   // first word

    for (i in 0 until input.length - 1) {
        if (input[i] == ' ' && input[i + 1] != ' ') {
            count++
        }
    }

    return count
}