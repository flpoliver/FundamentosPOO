package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val felipe = Pessoa(nome = "Felipe Oliveira", cpf = "11232452356")
    println(felipe.nome)
    println(felipe.cpf)

    val joao = Funcionario(
        "Joao Silva",
        "1238609712",
        BigDecimal.valueOf(2000.00)
    )

    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}