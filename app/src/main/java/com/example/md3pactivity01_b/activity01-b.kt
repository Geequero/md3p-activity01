package com.example.md3pactivity01_b

data class Book(val title: String, val author: String, val description: String)

fun main() {
    val library = listOf(
        Book("To Kill a Mockingbird", "Harper Lee", "A novel about justice and racism in the American South."),
        Book("1984", "George Orwell", "A dystopian novel about a totalitarian society and the struggle for freedom."),
        Book("The Great Gatsby", "F. Scott Fitzgerald", "A story about love, wealth, and the pursuit of the American Dream."),
        Book("Pride and Prejudice", "Jane Austen", "A classic novel about love, class, and social customs in 19th century England."),
        Book("The Catcher in the Rye", "J.D. Salinger", "A coming-of-age novel about a teenage boy's struggle with depression and disillusionment."),
        Book("Brave New World", "Aldous Huxley", "A dystopian novel about a genetically engineered society."),
        Book("Animal Farm", "George Orwell", "An allegorical novel about the corruption of power."),
        Book("The Lord of the Rings", "J.R.R. Tolkien", "An epic fantasy trilogy about a quest to destroy a powerful ring."),
        Book("The Hobbit", "J.R.R. Tolkien", "A prequel to The Lord of the Rings about a hobbit's adventure to reclaim treasure from a dragon."),
        Book("The Hunger Games", "Suzanne Collins", "A dystopian novel about a televised battle to the death as entertainment for the ruling class.")
    )

    println("Here is a list of available books:")
    library.forEachIndexed { index, book ->
        println("${index + 1}. ${book.title}")
    }

    println("Enter the number of the book you want to borrow:")
    val bookIndex = readLine()?.toIntOrNull()

    if (bookIndex != null && bookIndex > 0 && bookIndex <= library.size) {
        val book = library[bookIndex - 1]
        println("You have borrowed the following book:")
        println("Title: ${book.title}")
        println("Author: ${book.author}")
        println("Description: ${book.description}")
    } else {
        println("Invalid book selection.")
    }
}