package conceitosbasicos.funcoes

/**
 *Faça um algoritmo que contenha uma função para ler as dimensões
 *  de um retângulo (base e altura),calcular e imprimir
 *  para o usuário a área do retângulo;
 *  A soma de duas áreas para construir minha casa
 */

//Exemplo de uma função sem retorno e sem parametro
fun calcularAreaRetanguloComInputUsuario(): Double {
    println("Digite a base: ")
    val base = readln().toDouble()
    println("Digite a altura: ")
    val altura = readln().toDouble()

    val areaRetangulo = base * altura
    println("O valor da área é de $areaRetangulo")

    return areaRetangulo
}

//Exemplo de função mais generica com parametro e sem retorno
fun calcularAreaRetangulo(base: Double, altura: Double) {
    val areaRetangulo = base * altura
    println("O valor da área do retangulo é $areaRetangulo")
}

//Exemplo de função sem parametro e sem retorno
fun calcularSomaAreas() {
    //Exemplo de uso do retorno de outra função
    val somaAreas = calcularAreaRetanguloComInputUsuario() + calcularAreaRetanguloComInputUsuario()
    println("A area total de construção é de: $somaAreas")
}


/**
 * Faça uma função que leia 5 números e exiba seus valores
 */

//Exemplo de função que recebe um array como parametro
fun mostrarValoresListaNumero(listaNumeros: IntArray) {
    listaNumeros.forEach { numero ->
        println(numero)
    }
}

//Exemplo de função que retorna um array
fun retornarListaNumeros(): IntArray {
    val listaNumero = intArrayOf(2, 45, 65, 100, 3)
    return listaNumero
}

//Exemplo de função que recebe um array como parametro e retorna um array
fun mostrarMensagemComQuantidade(quantidadeNomes: IntArray): ArrayList<String> {
    val nomesExibir = ArrayList<String>(5)
    quantidadeNomes.forEach { quantidade ->
        nomesExibir.add("$quantidade nomes")
    }
    return nomesExibir
}

//Exemplo de função que retorna um array nullable
fun retornarListaNomes(): Array<String?> {
    println("Digite a capacidade: ")
    val capacidade = readln().toInt()

    val listaNomes = arrayOfNulls<String>(capacidade)
    listaNomes.forEachIndexed { index, _ ->
        println("Digite um nome: ")
        listaNomes[index] = readln()
    }
    return listaNomes
}

//Exemplo de função que recebe um array nullable
fun exbirNomesLista(listaNomes: Array<String?>) {
    listaNomes.forEach { nome ->
        println(nome)
    }
}

fun main() {
    /**Referenciando a função que calcula a soma entre as areas de um retangulo*/
    println("=========================================================")
    println("Exemplo do calculo do retangulo com funções")
    println("=========================================================")

    calcularSomaAreas()


    /**Exemplo de uso de como usar o retorno de uma função em uma única linha
     * retornarListaNumeros() como valor do parametro da função mostrarvaloresListaNumero(listaNumeros: IntArray)
     */
    println("=========================================================")
    println("Exemplo de mostrar lista de números com funções")
    println("=========================================================")
    mostrarValoresListaNumero(retornarListaNumeros())


    /**Exemplo de uso de como usar o retorno de uma função em duas linhas com uma variável de auxilio
    //listaNumerosArray armazena o retorno da função retornarListaNumeros() e depois a variável
    //é passada como valor do parametro da função mostrarValoresListaNumero(listaNumerosArray)
     */
    println("=========================================================")
    val listaNumerosArray = retornarListaNumeros()
    mostrarValoresListaNumero(listaNumerosArray)


    /**Exemplo de uso de como usar o retorno de uma função em duas linhas com uma variável de auxilio
    //listaNomesComQuantidade armazena o retorno da função mostrarMensagemComQuantidade(quantidadeNomes: IntArray )
    // que recebe como valor do parametro o retorno da função retornarListaNumeros()
    //depois é exibida a lista dentro de um println com a variável dentro
     */
    val listaNomesComQuantidade = mostrarMensagemComQuantidade(retornarListaNumeros())
    println("=========================================================")
    println("Exemplo de mostrar lista de quantidade de nomes com funções")
    println("=========================================================")
    println("Exemplo de array = $listaNomesComQuantidade")

    
    /**Exemplo de uso de como usar o retorno de uma função em uma única linha
     * retornarListaNomes() como valor do parametro da função exbirNomesLista(listaNomes: Array<String?>
     */
    println("=========================================================")
    println("Exemplo de mostrar lista de nomes com funções")
    println("=========================================================")

    exbirNomesLista(retornarListaNomes())

}

