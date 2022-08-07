package br.com.bytebank.testes

import br.com.bytebank.modelo.*

fun testaComportamentosConta(){

    val cliente1 = Cliente(
        id = 1000,
        nome = "Luiz Filho",
        cpf = 1234567890,
        senha = "Zuilinho123",
        endereco = Endereco(
            logradouro = "Rua Gradle",
            numero = 123,
            bairro = "IntelliJ",
            cidade = "Curitiba",
            estado = "PR",
            cep = "12345-67",
            complemento = "Casa 1"
        ))

    val cliente2 = Cliente(
        id = 1000,
        nome = "Mauro Lucas",
        cpf = 987654320,
        senha = "Mauro123",
        endereco = Endereco(
            logradouro = "Rua Gradle",
            numero = 123,
            bairro = "IntelliJ",
            cidade = "Curitiba",
            estado = "PR",
            cep = "12345-67",
            complemento = "Casa 1"
        ))

    val conta1 = ContaCorrente(
        titular = cliente1,
        numero = 100
    )
    val conta2 = ContaPoupança(
        titular = cliente2,
        numero = 100
    )

    println("Titular da conta ${conta1.numero}: ${conta1.titular.nome}")
}
