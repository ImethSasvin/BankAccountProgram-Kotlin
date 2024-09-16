package com.example.bankaccountprogram

import java.time.temporal.TemporalAmount

class BankAccount (
    var accountHolder: String,
    var balance: Double,)

{

    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double){

        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")

    }

    fun withdraw(amount: Double){

        if(amount<balance){
            balance -= amount
            transactionHistory.add("$accountHolder withdrew $$amount")
        }else{
            println("You don't have enough funds to withdraw $$amount")
        }
    }

    fun displayTransactionHistory(){

        for(transaction in transactionHistory){
            println(transaction)
        }

    }

    fun acctBalance(){
        println("Available balance in ${accountHolder}'s account: $$balance")
        println("-------------------------------------")
    }
}