package com.example.week1activities.week1

// Convert Celsius to Fahrenheit: Write a function that takes a temperature in Celsius as input and returns the equivalent temperature in Fahrenheit.
fun main (){
    println("Celsius to Fahrenheit Converter")

    print("Enter Celsius : ")
    val celsius :Double = readln().toDouble()

    // Formula to Convert Celsius to Fahrenheit
    //  9/5 * celsius + 32

    print(convertCelsiusToFahrenheit(celsius))
    print(" Fahrenheit")
}

fun convertCelsiusToFahrenheit(celsius: Double): Double {
    val fahrenheit : Double = celsius * 9/5 + 32
    return fahrenheit
}