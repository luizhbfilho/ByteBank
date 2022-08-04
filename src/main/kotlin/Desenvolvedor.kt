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

    override fun bonificacao(): Double = salario * 0.5 + salario

    override fun autenticacao(senha: String): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}


