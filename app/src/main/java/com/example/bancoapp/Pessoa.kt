package com.example.bancoapp

class Pessoa {
    var nome: String = "Carla"
    var cpf: String = "111.123.123-45"
}

fun main(){
    val Emi = Pessoa()

    println(Emi.nome)
    println(Emi.cpf)
}