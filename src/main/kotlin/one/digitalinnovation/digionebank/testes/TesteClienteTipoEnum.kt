package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - $elemento.")
    }

    ClienteTipo.values().forEach {
        println("${it.name} - $it.")
    }
}