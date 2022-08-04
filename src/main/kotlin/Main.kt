import testes.testaComportamentosConta

fun main() {
    val desenvolvedor = Desenvolvedor(
        id = 1000,
        nome = "Luiz Filho",
        salario = 5000.0,
        idade = 23,
        senha = "Zuilinho123")

    val sistema = SistemaInterno()
    sistema.entra(desenvolvedor, "Zuilinho123")
}

