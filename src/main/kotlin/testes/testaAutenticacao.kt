import testes.testaComportamentosConta

fun testaAutenticacao() {
    val desenvolvedor = Desenvolvedor(
        id = 1000,
        nome = "Luiz Filho",
        salario = 5000.0,
        idade = 23,
        senha = "Zuilinho123")

    val cliente = Cliente(
        id = 1000,
        nome = "Mauro Lucas",
        cpf = 1234567890,
        senha = "Mauro123"
    )

    val sistema = SistemaInterno()
    sistema.entra(desenvolvedor, "Zuilinho123")
    sistema.entra(cliente, "Mauro123")
}

