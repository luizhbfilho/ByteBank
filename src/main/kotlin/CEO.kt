class CEO(
    id: Int,
    nome: String,
    salario: Double,
    idade: Int,
    var auxilioViagem: Double
): Funcionario(id = id, nome = nome, salario = salario, idade = idade) {

    override fun bonificacao(): Double = salario * 1.0 + salario
}