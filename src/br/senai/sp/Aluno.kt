package br.senai.sp

class Aluno (nome: String,
             email: String,
             idade: Int) {

    private var nome: String
    private var email: String
    private var idade: Int

    init {
        this.nome = nome
        this.email = email
        this.idade = idade
    }

}