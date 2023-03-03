package com.example.week1activities.week1

fun main() {
    println("  Multiply two numbers")

    println("")
    print("Enter first number: ")
    val firstNumber: Int = readLine()!!.toInt()

    print("Multiply by")
    println("")
    print("Enter second number: ")
    val secondNumber: Int = readLine()!!.toInt()

    val answer: Int = firstNumber * secondNumber
    println("")
    println("The answer is: $answer")

}