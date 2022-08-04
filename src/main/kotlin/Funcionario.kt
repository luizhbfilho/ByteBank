abstract class Funcionario(
    val id: Int,
    val nome: String,
    var salario: Double,
    var idade: Int
) {
    abstract fun bonificacao(): Double
}