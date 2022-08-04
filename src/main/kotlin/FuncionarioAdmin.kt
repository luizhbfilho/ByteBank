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
    idade = idade)
{
    abstract fun autenticacao(senha: String): Boolean
}