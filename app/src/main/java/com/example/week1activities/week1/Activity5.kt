package com.example.week1activities.week1

import kotlin.math.pow

fun main() {
    println(calculateAreaOfCircle())
    // ( Pi * radius^2)
}

fun calculateAreaOfCircle(): Double {
    val pi = 3.14
    val radius = 5.0
    radius.pow(2.0)


    return radius.pow(2.0) * pi

}