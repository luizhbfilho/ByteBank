import br.com.bytebank.modelo.Conta.*
import br.com.bytebank.modelo.Endereco
import br.com.bytebank.testes.*

fun main() {

    val endereco = Endereco(logradouro = "Rua Joao DAgostin", cep = "83413-372")
    val endereco2 = Endereco(cep = "83413-37")
    println(endereco.toString())
    println(endereco.equals(endereco2))
}



