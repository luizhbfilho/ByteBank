package br.com.bytebank.modelo

class ContaPoupança(
    titular: String,
    numero: Int
) : Conta(
    titular,
    numero) {
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