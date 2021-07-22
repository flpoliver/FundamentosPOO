package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista


fun main() {
    val felipe = Analista("Felipe Oliveira", "11232452356", 2000.00)
    ImprimeRelatorioFuncionario.imprime(felipe)
}

