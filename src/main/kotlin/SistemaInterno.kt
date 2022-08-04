class SistemaInterno {
    fun entra(admin: FuncionarioAdmin, senha: String){
        if(admin.autenticacao(senha)){
            println("Bem vindo!")
        } else {
            println("Senha incorreta!")
        }
    }
}