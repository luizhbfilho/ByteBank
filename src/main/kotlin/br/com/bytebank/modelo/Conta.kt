package br.com.bytebank.modelo

abstract class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    abstract fun depositar(valor: Double)

    abstract fun sacar(valor: Double)

    abstract fun transfere(valor: Double)

//    fun obterSaldo(conta: modelo.Conta) {
//        return println("Saldo da conta: R$${conta.saldo}")
//    }
//
//    fun setSaldo(valor: Double) {
//        this.saldo = valor
//        println("Saldo alterado para: R${this.saldo}")
//    }
}