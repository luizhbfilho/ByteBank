package br.com.bytebank.modelo

interface Autenticavel {

    fun autenticacao(senha: String): Boolean
}