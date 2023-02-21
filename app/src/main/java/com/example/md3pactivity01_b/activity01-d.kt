package com.example.md3pactivity01_b

fun main() {
    val amounts = mutableListOf<Double>()
    for (i in 1..5) {
        print("Enter amount $i: ")
        val amount = readLine()?.toDoubleOrNull()
        if (amount == null) {
            println("Invalid amount, please enter a valid number.")
            return
        }
        amounts.add(amount)
    }

    print("Enter the amount to divide by: ")
    val divisor = readLine()?.toDoubleOrNull()
    if (divisor == null || divisor == 0.0) {
        println("Invalid divisor, please enter a non-zero number.")
        return
    }

    val total = (amounts.sum() / divisor) / amounts[1]
    println("The result is: $total")
}