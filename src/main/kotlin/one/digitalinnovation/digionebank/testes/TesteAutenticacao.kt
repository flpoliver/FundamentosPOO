package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Sessao

class TesteAutenticacao {
    fun autenticado(sessao: Sessao) = println(sessao.login())
}