package br.com.bytebank.modelo

class Desenvolvedor (
    id: Int,
    nome: String,
    salario: Double,
    idade: Int,
    senha: String
): FuncionarioAdmin(
    id = id,
    nome = nome,
    salario = salario,
    idade = idade,
    senha = senha) {
    override fun autenticacao(senha: String): Boolean {
        return super<FuncionarioAdmin>.autenticacao(senha)
    }

    override fun bonificacao(): Double = salario * 0.5 + salario
}


