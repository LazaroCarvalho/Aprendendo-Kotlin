package br.senai.sp

import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {

    println(queDiaEHoje())
    somar(8, 4)
    somar(2, 3, 4)

    println(10.0.pow(0.02))

}

fun queDiaEHoje(): Date {
    return Date()
}

fun somar(valor1: Int,  valor2: Int) {
    var soma = valor1 + valor2
    println(soma)
}

fun somar(valor1: Int,  valor2: Int, valor3: Int): Int {
    var soma = valor1 + valor2 + valor3
    println(soma)
    return soma
}