fun testaComportamentos() {
    var desenvolvedor1 = Desenvolvedor(
        nome = "Luiz Filho",
        salario = 5000.0,
        idade = 23,
        id = 1,
        senha = "Zuilinho@123"
    )
    var funcionario1 = Desenvolvedor(
        nome = "Mauro Lucas",
        salario = 2500.0,
        idade = 23,
        id = 2,
        senha = "Zuilinho123"
    )


    println("Desenvolvedor 1: ${desenvolvedor1.nome}")
    println("Bonificacao do funcionario ${desenvolvedor1.nome}: ${desenvolvedor1.bonificacao()}")
    if (desenvolvedor1.autenticacao("Zuilinho@123")){
        println("Autenticado com sucesso!")
    } else {
        println("Senha incorreta!")
    }
    println("Desenvolvedor 1: ${funcionario1.nome}")
    println("Bonificacao do funcionario ${funcionario1.nome}: ${funcionario1.bonificacao()}")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(funcionario1)
    calculadora.registra(desenvolvedor1)
    println("Total de bonificacao: ${calculadora.total}")
}