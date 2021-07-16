package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Felipe"

    var cpf: String = "454.958.098-43"
    private set
    //privando o método set para não ser possível alterar seu valor
}

fun main() {
    val felipe = Pessoa()

    //felipe.cpf = "1892738"

    println(felipe.nome)
    println(felipe.cpf)

}