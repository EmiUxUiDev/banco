package com.example.bancoapp.test
import com.example.bancoapp.Pessoa
import com.example.bancoapp.Funcionario
import com.example.bancoapp.Analista

fun main() {
    val Emiliano = Analista(nome="Emiliano Agu",
        cpf = "689772265-41",
        salario = 6897.24)
    ImprimeRelatorioFuncionario.imprime(Emiliano)
}

