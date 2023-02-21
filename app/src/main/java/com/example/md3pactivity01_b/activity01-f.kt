package com.example.md3pactivity01_b


fun main() {
    print("Enter first string: ")
    val str1 = readLine()!!
    print("Enter second string: ")
    val str2 = readLine()!!
    val uniqueChars = mutableSetOf<Char>()

    for (char in str1 + str2) {
        if (char !in uniqueChars) {
            uniqueChars.add(char)
        }
    }

    println("Unique characters in both strings: ")
    for (char in uniqueChars) {
        print("$char ")
    }
}