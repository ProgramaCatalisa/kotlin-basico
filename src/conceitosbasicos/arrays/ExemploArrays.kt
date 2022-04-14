package conceitosbasicos.arrays

fun main() {
    //Exemplo de declaração e adição de valores para um array
    var listaIdade = intArrayOf(12, 34, 22)
    val listaNomes = arrayOf("Jessica", "Rodrigo", "Carol")
    val listaFrutas = ArrayList<String>(10)
    var listaSalarios = DoubleArray(12)

    //Exemplo de inserção de valores em um array
    listaFrutas.add("banana") //lembrando que a listaFrutas é um ArrayList<String>
    listaFrutas.add("maçã") //lembrando que a listaFrutas é um ArrayList<String>
    listaFrutas.add("laranja") //lembrando que a listaFrutas é um ArrayList<String>
    listaSalarios[0] = 2.500

    println("----------------------------------------------------------------------------")
    println("Exemplo de recuperar o valor a partir do index de um array")
    println("----------------------------------------------------------------------------")
    println("Idade na posição 2 do vetor listaIdade: ${listaIdade[2]}")
    println("Nome na posição 1 do vetor listaNomes: ${listaNomes[1]}")
    println("Fruta na posição 0 do vetor listaFrutas: ${listaFrutas[0]}")
    println("Salário na posição 0 do vetor listaSalario: ${listaSalarios[0]}")


    println("----------------------------------------------------------------------------")
    println("Exemplo percorrendo um array usando for com manipulação de valores")
    println("----------------------------------------------------------------------------")
    for (nomeNaLista: String in listaNomes) {
        println("O nome da é $nomeNaLista")
    }

    println("----------------------------------------------------------------------------")
    println("Exemplo percorrendo um array usando for com manipulação de indices")
    println("----------------------------------------------------------------------------")
    for (i: Int in listaNomes.indices) {
        println("O nome na posição $i é ${listaNomes[i]}")
    }

    println("----------------------------------------------------------------------------")
    println("Exemplo de uso de um forEach manipulando o valor")
    println("----------------------------------------------------------------------------")
    listaFrutas.forEach { fruta ->
        println("A fruta atual é $fruta")
    }

    println("----------------------------------------------------------------------------")
    println("Exemplo de uso de um forEach manipulando com indices")
    println("----------------------------------------------------------------------------")
    listaFrutas.forEachIndexed { index, fruta ->
        println("A fruta na posição $index é $fruta")
    }

    println("----------------------------------------------------------------------------")
    println("Exemplo de for percorrento entre valores")
    println("----------------------------------------------------------------------------")
    for (i in 0 .. 10){
        println(i)
    }

    println("----------------------------------------------------------------------------")
    println("Exemplo de for percorrento entre valores e pulando de 2 em 2")
    println("----------------------------------------------------------------------------")
    for (i in 0 .. 100 step 2){
        println(i)
    }

    println("----------------------------------------------------------------------------")
    println("Exemplo de for percorrento entre valores e pulando de 2 em 2 em ordem decrescente")
    println("----------------------------------------------------------------------------")
    for (i in 50 downTo  0 step 2){
        println(i)
    }
}