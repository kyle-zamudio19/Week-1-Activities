package com.example.week1activities.week1

fun main() {
    println("   Put five monetary amounts")
    print("")
    println("Enter first monetary amount: ")
    val amountOne: Int = readLine()!!.toInt()
    println("Enter second monetary amount: ")
    val amountTwo: Int = readLine()!!.toInt()
    println("Enter third monetary amount: ")
    val amountThree: Int = readLine()!!.toInt()
    println("Enter fourth monetary amount: ")
    val amountFour: Int = readLine()!!.toInt()
    println("Enter fifth monetary amount: ")
    val amountFive: Int = readLine()!!.toInt()

    //Let's call here the function for sum of five monetary amounts inside the println function
    println("The sum of five amounts is:")
    val sum = sumOfAmounts(amountOne,amountTwo,amountThree,amountFour,amountFive)
    println(sum)

    println("Divide the value by how many?: ")
    val divideBy: Int = readLine()!!.toInt()
    println("The result is:")
    println(divideAmount(sum, divideBy))

}//This function have five parameters, these five parameters represents the five monetary amounts
//It will also print the sum of the five monetary amounts
fun sumOfAmounts(am1: Int, am2: Int, am3: Int, am4: Int, am5: Int): Int {
    return am1 + am2 + am3 + am4 + am5
}

fun divideAmount(totalAmount: Int, divideBy: Int) : Int {
    return totalAmount / divideBy
}