package br.com.bytebank.modelo

abstract class FuncionarioAdmin(
    id: Int,
    nome: String,
    salario: Double,
    idade: Int,
    val senha: String
): Funcionario(
    id = id,
    nome = nome,
    salario = salario,
    idade = idade
), Autenticavel {

    override fun autenticacao(senha: String): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}