class CalculadoraBonificacao {
    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao()
    }
    fun registra(desenvolvedor: Desenvolvedor) {
        this.total += desenvolvedor.bonificacao()
    }
}