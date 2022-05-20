fun main() {
    /*
    Kotlin
    * Paradigma Funcional = trabalha com funções
    * Paradigma Orientado a objetos = trabalha com objetos e métodos

    Java
    somente Paradigma Orientado a objetos = trabalha com objetos e métodos
    * */
    val restaurante = Restaurante()

    //Esse método tá dentro da classe restaurante
    fun prepararAlmoco(dinheiro: Double, pedido: String): Almoco {
        //lógica almoço
        return almoco
    }

    val almocoPronto = restaurante.prepararAlmoco(10.00, "o de hoje")

    val victor = Victor()
    victor.comer(almocoPronto)

    val correio = Correio()

    fun postarObjeto(objetoASerPostado: ObjetoCorreio) {
        print("Objeto despachado")
    }
    correio.postarObjeto()

    /*
    Short - números inteiros armazenam valor minimo -32768 e maximo 32767
    Int - números inteiros armazenam valor minimo -2,147,483,648 (-231) e maximo 2,147,483,647 (231 - 1)
    Double - números decimais
    Float - números decimais
    BigDecimal -
    Long - números decimais armazenam valor minimo -9,223,372,036,854,775,808 (-263) e maximo 9,223,372,036,854,775,807 (263 - 1)
    Dica dos profs: foquem no int e double
    * */

    /*
    * Pergunta: por que no e2 temos um f?
    * Resposta: Isso serve para distinguir qual o tipo do número para o Kotlin, se não ele interpretará que é um double se não tiver o f
    * */
    val e1: Double = 2.7182818284    // Double
    var e2 = 2.7182818284f   // Float

    val tempoHoje = "chuva"
    val tempoAmanhã = "sol"

    /*
    * Parâmentro ou argumento ou condição
    * Parâmentro em if != de parâmetro de função
    * */
    if (tempoHoje == "nublado") {
        println("Posso sair")
    } else if (tempoHoje == "chuva") {
        println("Não posso sair")
    } else {
        println("Posso sair")
    }

    val rotacaoTerra = 5
    /*
    * No java seria isso: rotacaoTerra >= 1 && rotacaoTerra <= 4
    * O que está dentro do for é: 1 <= rotacaoTerra <= 4
    * */
    for (rotacaoTerra in 1..4) {
        print("Dei uma volta")
    }

    /*
    * If (Se): Representar o exemplo: SE você estiver doente...Então tomo remédio
    * Else (Caso contrário): Eu não tomo remédio
    * When (Quando): Quando [CONDIÇÃO SIMPLES] então...
    * For (Para):
    * Do...While: Faça ... enquanto
    * While (Enquanto): Enquanto [CONDIÇÃO] segue fazendo o que eu pedir
    * For each:
    * */

    var contador = 10
    while (contador > 0) {
        println(
            "Eu sou a melhor programadora do mundo"
        )
        println(contador)
        contador -= 1
        println(contador)
    }

    /*
    * Exemplo while
    * */
    var controlador = true
    while (controlador) {
        print("Quer continuar? ")
        var input = readln()
        *//*
        * Se input for igual a "n" OU input for igual a "N"
        * *//*
        if (input == "n" || input == "N") {
            controlador = false
        }
    }

    var controlador02 = true
    do {
        print("Quer continuar? ")
        var input = readln()

        if (input.equals("n", ignoreCase = true)) {
            controlador02 = false
        }
    } while (controlador02)

    /*
    * Exemplo para comparar com o do..while
    * */
    var controlador03 = false
    while (controlador03) {
        print("Quer continuar? ")
        var input = readln()

        /*Se input for igual a "n" OU input for igual a "N"
        * 
        * */
        if (input == "n" || input == "N") {
            controlador = false
        }
    }
}
