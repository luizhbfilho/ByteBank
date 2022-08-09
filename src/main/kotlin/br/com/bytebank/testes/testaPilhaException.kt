package br.com.bytebank.testes

import br.com.bytebank.modelo.Endereco

fun testaPilhaException() {
    println("Function main start")
    val entrance: String = "12"

    val entranceReceived: Double? = try {
        entrance.toDouble()
    } catch(e: NumberFormatException) {
        e.printStackTrace()
        println("Invalid format")
        null
    }

    val taxValue: Double? = if (entranceReceived != null){
        entranceReceived + 0.1
    } else {
        println("Null value")
        null
    }

    if (taxValue != null) {
        println("Received: $taxValue")
    } else {
        println("No receive")
    }

    function1()
}

fun function1() {
    println("Function 1 start")
    try {
        function2()
    } catch (e: java.lang.ClassCastException) {
        println(e.message)
        println("Class Exception is taken")
    }
    println("Function 1 end")
}

fun function2() {
    println("Function 2 start")
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        throw ClassCastException()
    }
    println("Function 2 end")
}
