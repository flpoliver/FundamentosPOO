package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Felipe"

    var cpf: String = "454.958.098-43"
    private set
    //privando o método set para não ser possível alterar seu valor

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val felipe = Pessoa()

    println(felipe.pessoaInfo())

}