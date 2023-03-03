package com.example.week1activities.week1

fun main(){
    print("Enter your name: ")
    val name = readLine()
    println("Your name is $name")
    print("Enter your age: ")
    val age = readLine()!!.toInt()
    println("Your age is $age")
    print("Enter your location: ")
    val location = readLine()
    println("Your location is $location")
    println("why do you want to learn mobile development?")
    val learn = readLine()
    println("$learn")
}