package com.example.bancoapp.test

import com.example.bancoapp.Banco

fun main(){
    val EmiBank = Banco(nome = "Emiliano Bank", numero = 5)
    println("O banco é: ${EmiBank.nome}, sucursal: ${EmiBank.numero}")
    println(EmiBank.Info())

    val BankCopy = EmiBank.copy(nome= "Alemao Bank", numero = 6)
    println("O nome do banco copia é: ${BankCopy.nome}, sucursal: ${BankCopy.numero}")
    println(BankCopy.Info())
}
