import interfaces.Autenticavel

class Cliente(
    val id: Int,
    val nome: String,
    val cpf: Int,
    var senha: String): Autenticavel
{

    override fun autenticacao(senha: String): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}

