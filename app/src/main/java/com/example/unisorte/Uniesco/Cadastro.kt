package com.example.unisorte.Uniesco

class Cadastro() {
    var listaCoisa: MutableList<String>

    init {
        this.listaCoisa = mutableListOf()
    }

    fun adicionar(palavra: String){
        listaCoisa.add(palavra)
    }

    fun sortear(): String?{
        if (listaCoisa.size > 0){
            return listaCoisa.random()
        }else
            return null
    }

}