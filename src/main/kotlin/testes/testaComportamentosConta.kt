package testes

import ContaCorrente

fun testaComportamentosConta(){
    var conta1 = ContaCorrente(
        titular = "Luiz Filho",
        numero = 1000
    )

        conta1.depositar(2000.0)
        conta1.sacar(1000.0)
        println("Saldo da conta: ${conta1.saldo}")
}
