package com.example.md3pactivity01_b

fun main() {
    print("Enter a string: ")
    val inputStr = readLine()

    if (inputStr == inputStr?.reversed()) {
        println("Palindrome")
    } else {
        println("Not a Palindrome")
    }
}