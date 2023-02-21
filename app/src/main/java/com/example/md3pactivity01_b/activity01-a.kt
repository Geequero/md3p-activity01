package com.example.md3pactivity01_b

import java.util.Random
data class Student(val id: Int, val name: String) {
    var grade: String? = null
    var nickname: String? = null
}

fun main() {
    println("MD3P Class Record")
    println()
    val students = mutableListOf(
        Student(1, "Alexander Chou"),
        Student(2, "John Cris Bolanio"),
        Student(3, "Andrew Bustos"),
        Student(4, "Rizwan Caser"),
        Student(5, "Laurence de Dios"),
        Student(6, "Jerome Elenzano"),
        Student(7, "Noven Rey Gumnad"),
        Student(8, "Junzon Velasco"),
        Student(9, "ZR Lopez"),
        Student(10, "Ryan Malacao"),
        Student(11, "Phil Manabat"),
        Student(12, "Dad Ivan Natividad"),
        Student(13, "Marie Fe Dela Peña"),
        Student(14, "Gretchen Roque"),
    )

    students.forEach {
        print("Enter grade for ${it.name}:")
        var input = readLine()
        while (input != "pass" && input != "fail") {
            println("Invalid input. Please enter either 'pass' or 'fail':")
            input = readLine()
        }
        it.grade = input
    }

    students.forEach {
        it.nickname = generateNickname()
        println("ID: ${it.id}\n Name: ${it.name}\n grade: ${it.grade}\n Nickname: ${it.nickname}\n")
    }

}

fun generateNickname(): String {
    val random = Random()
    val adjectives = listOf("Smart", "Funny", "Brave", "Quiet", "Silly", "Nice")
    val animals = listOf("Tikbalang", "Kapre", "Tyanak", "Multo", "Engkanto", "Aswang")

    return "${adjectives[random.nextInt(adjectives.size)]} ${animals[random.nextInt(animals.size)]}"
}