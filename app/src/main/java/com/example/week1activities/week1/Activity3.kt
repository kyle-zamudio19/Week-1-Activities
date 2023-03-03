package com.example.week1activities.week1

fun main() {

    // Create a variable ‘num’ and assign it an integer value of your choice. Then, write a program that calculates the square of ’num’ and stores the result in a new variable ’result’. Finally, print the value of ’result’ to the console.

    print("Enter number: ")
    val number = readLine()!!.toInt()
    print("The Square of $number is: ${number * number} ")

    // Create two variables ’name’ and ’city’, both of type string, and assign them values of your choice. Write a program that concatenates the values of ’name’ and ’city’ and stores the result in a new variable ’fullLocation’. Finally, print the value of ’fullLocation’ to the console.

    println("")
    print("Enter your Barangay: ")
    val name = readLine()!!.toString()

    print("")
    print("Enter your City: ")
    val city = readLine()!!.toString()

    // Create two variables ’length’ and ’width’ that store the length and width of a rectangle. Write a program that calculates the area of the rectangle and stores the result in a new variable ’area’. The formula to calculate the area of a rectangle is area = length * width. Finally, print the value of area to the console.

    val fullLocation = "$name, $city City"
    println("Your full location is: $fullLocation")

    print("Enter Length: ")
    val length = readLine()!!.toInt()
    print("")
    print("Enter Width: ")
    val width = readLine()!!.toInt()
    val area = length * width
    print("The Area is: $area ")
}