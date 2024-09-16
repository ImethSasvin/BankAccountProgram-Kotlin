package com.example.bankaccountprogram

fun main(){

    val  imethsBankAcc = BankAccount("Imeth Sasvin", 2500.00)

    imethsBankAcc.deposit(2500.00)
    imethsBankAcc.withdraw(1502.00)
    imethsBankAcc.deposit(2541.00)
    imethsBankAcc.withdraw(3120.00)

    imethsBankAcc.displayTransactionHistory()
    println("${imethsBankAcc.accountHolder}'s account " +
            "balance is $${imethsBankAcc.balance}")


}