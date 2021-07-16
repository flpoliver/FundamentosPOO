package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Felipe"
    var cpf: String = "454.958.098-43"
}

fun main() {
    val felipe = Pessoa()

    println(felipe.nome)
    print(felipe.cpf)
}