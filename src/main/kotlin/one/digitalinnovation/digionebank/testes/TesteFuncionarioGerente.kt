package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente


fun main() {
    val rodrigo = Gerente("Rodrigo Silva", "11232232356", 5000.00, "senha125")

    ImprimeRelatorioFuncionario.imprime(rodrigo)

    TesteAutenticacao().autenticado(rodrigo)
}

