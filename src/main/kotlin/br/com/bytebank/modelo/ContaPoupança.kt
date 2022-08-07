package br.com.bytebank.modelo

class ContaPoupança(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero) {
    override fun depositar(valor: Double) {
        TODO("Not yet implemented")
    }

    override fun sacar(valor: Double) {
        TODO("Not yet implemented")
    }

    override fun transfere(valor: Double) {
        TODO("Not yet implemented")
    }

}