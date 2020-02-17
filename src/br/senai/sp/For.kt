package br.senai.sp

fun main(args: Array<String>) {

    for(item in 0..20) {
        println("Item $item")
    }

    for(x in 1..5) println("X= $x")

    var cidades = arrayOf("Jandira", "Itapevi", "Barueri")

    for(cidade in cidades) println("Cidade de $cidade")

    var escola = "SENAI Vicente Amato"

    for((index, letra) in escola.withIndex()) {
        println("$index - $letra")
    }

    for(numero in 0..5) println(numero)

}