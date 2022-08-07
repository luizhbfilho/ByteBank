package br.com.bytebank.modelo

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero) {

    override fun sacar(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }
    override fun depositar(valor: Double) {
        this.saldo += valor
    }
    override fun transfere(valor: Double) {
        TODO("Not yet implemented")
    }
}