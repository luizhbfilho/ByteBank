package br.com.bytebank.modelo

class Estagiario(
    id: Int,
    nome: String,
    salario: Double,
    idade: Int
): Funcionario(
    id = id,
    nome = nome,
    salario = salario,
    idade = idade
) {
    override fun bonificacao(): Double {
        TODO("Not yet implemented")
    }
}