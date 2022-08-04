class Desenvolvedor (
    id: Int,
    nome: String,
    salario: Double,
    idade: Int,
    var senha: String
): Funcionario(id = id, nome = nome, salario = salario, idade = idade) {

    override fun bonificacao(): Double = salario * 0.5 + salario

    fun autenticacao(senha: String): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}


