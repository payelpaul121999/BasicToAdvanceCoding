package com.palpa.codingpracticedaliy.string



fun splitUniqueByCase(input: String): Pair<String, String> {
    val lowerSeen = LinkedHashSet<Char>()
    val upperSeen = LinkedHashSet<Char>()

    for (ch in input) {
        when {
            ch.isLowerCase() -> lowerSeen.add(ch.lowercaseChar())
            ch.isUpperCase() -> upperSeen.add(ch.uppercaseChar())
        }
    }

    val lower = lowerSeen.joinToString("")
    val upper = upperSeen.joinToString("")
    println("lower $lower Upper $upper")
    return lower to upper
}

fun splitUniqueByCases(input: String): Pair<String, String> {
    val lower = LinkedHashSet<Char>()
    val upper = LinkedHashSet<Char>()

    input.forEach { ch ->
        if (ch.isLowerCase()) lower += ch
        else if (ch.isUpperCase()) upper += ch
    }

    return lower.joinToString("") to upper.joinToString("")
}