package com.example.bancoapp.test

import com.example.bancoapp.Funcionario
import com.example.bancoapp.Gerente

fun main() {
    val Maria = Gerente(nome="Maria Gedes",
        cpf = "681227225-41",
        salario = 8908.42)
    ImprimeRelatorioFuncionario.imprime(Maria)
}
