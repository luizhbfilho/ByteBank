import interfaces.Autenticavel

class CEO(
    id: Int,
    nome: String,
    salario: Double,
    idade: Int,
    senha: String,
    var auxilioViagem: Double
) : FuncionarioAdmin(
    id = id,
    nome = nome,
    salario = salario,
    idade = idade,
    senha = senha
), Autenticavel {

    override fun bonificacao(): Double = salario * 1.0 + salario

    override fun autenticacao(senha: String): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}