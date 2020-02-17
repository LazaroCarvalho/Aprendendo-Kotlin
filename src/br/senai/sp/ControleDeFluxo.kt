package br.senai.sp

fun main (args: Array<String>) {

    val pedro = Aluno("Pedro", "pedro@bol.com.br", 20)
    println(pedro.nome)

    val ana = Aluno("Ana", "ana@ig.com.br", 17)

    println(ana.nome)
    println(ana.email)
    println(ana.idade)

    var idade = 18

    if(idade >= 18)
        println("Você é maior de idade!")
    else
        println("Você é menor de idade!")

}