package com.example.week1activities.week1

import kotlin.math.pow

fun main() {

    println("Enter loan amount: ")
    val loanAmount : Double = readLine()!!.toDouble()
    println("Enter interest rate: ")
    val interestRate : Double = readLine()!!.toDouble()
    println("Enter loan term: ")
    val loanTerm : Double = readLine()!!.toDouble()
    val convertInterestRateToPercentage = interestRate / 100

    calculateMonthlyPayment(loanAmount, convertInterestRateToPercentage, loanTerm)

}

fun calculateMonthlyPayment(loanAmount: Double, interestRate: Double, loanTerm: Double) {
    // The formula for calculating monthly payment is P = L[i(1 + i)^n]/[(1 + i)^n – 1]
    // where P = Monthly Payment
    // L = Loan Amount
    // i = interest rate / 12
    // n = loan terms

    //For i variable, we still need the interest rate to be divided to 12,
    val i = interestRate / 12

    //Now the values needed for the formula is complete.

    //Let's try to dissect the formula, there's a repeating instance in the formula this is (1 + i)^n
    //Let's declare a variable for that. We also need to user Math.pow function since it has an exponent ^
    //Let's name it as variable exponent
    val exponent = (1 + i).pow(loanTerm)
    // this represents the (1 + i)^n

    //Next, let's complete the formula
    val monthlyPayment = loanAmount * ( i * (exponent)) / exponent - 1
    println("Your monthly payment is P$monthlyPayment")
}

