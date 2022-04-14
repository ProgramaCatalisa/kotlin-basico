package conceitosbasicos

import kotlin.system.exitProcess

fun main() {
    //Exemplo de saída de dados com println() e print()
    println("Olá mundo!")
    print("Digite seu nome: ")

    //declaração de variável de leitura usando a palavra val
    //usamos a função readln() para recuperar um input do console
    val nome = readln()

    println("Olá $nome! Por favor digite sua idade: ")
    //exemplo de conversão de dado de um tipo String para o tipo Int usado o readln().toInt()
    val idade = readln().toInt()

    print("Agora digite seu endereço: ")
    //declaração de variável de leitura e escrita usando a palavra var
    //além disso deixamos explicíto com o uso do operador ? que a variável aceita null ou conhecidas tambem como nullable
    var endereco: String? = readln()

    //exemplo de atribuição de null em uma varável nullable
    endereco = null

    //exemplo de safe-call em uma variavel nullable usando o operador ?
    println("Uma curiosidade - sabia que seu endereço possui ${endereco?.length} caracteres")
    println("Vamos descobrir se você $nome está liberado ao entrar na festa: ")

    //Exemplo de condicional if else
    if (idade <= 18){
        println("Acho que você não pode entrar nessa festa, melhor chamar um Uber para $endereco")
    }else{
        println("Bora curtir a festa :D")
    }

    println("Deseja encerrar o programa? [1 - SIM | 2 - NAO]")
    val opcao = readln().toInt()

    //Exemplo de condicional when
    when(opcao){
        1 -> exitProcess(0)
        2 -> println("Podemos continuar outra hora o que acha?")
        else -> {
            print("Opção inválida!")
        }
    }
}