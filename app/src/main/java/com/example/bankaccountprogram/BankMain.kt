package com.example.bankaccountprogram

fun main(){

    val  imethsBankAcc = BankAccount("Imeth Sasvin", 2500.00)

    imethsBankAcc.deposit(2500.00)
    imethsBankAcc.withdraw(1502.00)
    imethsBankAcc.deposit(2541.00)
    imethsBankAcc.withdraw(3120.00)

    imethsBankAcc.displayTransactionHistory()
    imethsBankAcc.acctBalance()


    val sarahBankAcc = BankAccount("Sarah",0.0)

    sarahBankAcc.deposit(100.00)
    sarahBankAcc.withdraw(10.00)
    sarahBankAcc.deposit(300.00)

    sarahBankAcc.displayTransactionHistory()
    sarahBankAcc.acctBalance()



}