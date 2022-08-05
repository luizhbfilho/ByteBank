package br.com.bytebank.modelo

class SistemaInterno {
    fun entra(admin: Autenticavel, senha: String){
        if(admin.autenticacao(senha)){
            println("Bem vindo!")
        } else {
            println("Senha incorreta!")
        }
    }
}