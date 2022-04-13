package conceitosbasicos

import kotlin.system.exitProcess

fun main() {
    println("Olá mundo!")

    print("Digite seu nome: ")
    val nome = readln()

    println("Olá $nome! Por favor digite sua idade: ")
    val idade = readln().toInt()

    print("Agora digite seu endereço: ")
    var endereco: String? = readln()

    println("Uma curiosidade - sabia que seu endereço possui ${endereco?.length} caracteres")
    println("Vamos descobrir se você $nome está liberado ao entrar na festa: ")

    if (idade <= 18){
        println("Acho que você não pode entrar nessa festa, melhor chamar um Uber para $endereco")
    }else{
        println("Bora curtir a festa :D")
    }

    println("Deseja encerrar o programa? [1 - SIM | 2 - NAO]")
    val opcao = readln().toInt()

    when(opcao){
        1 -> exitProcess(0)
        2 -> println("Podemos continuar outra hora o que acha?")
        else -> {
            print("Opção inválida!")
        }
    }
}