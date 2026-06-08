package com.example.baseskotlin

fun main(){

    val semana = arrayOf("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo")


    val palabra = "hola"
    val letras = palabra.split("").filter { it.isNotEmpty() }
    //println(letras)

    for (dia in semana.indices){
        val separados = semana[dia].split("").filter { it.isNotEmpty() }
        println(separados)
    }

    for(dia in semana.size -1 downTo 0){
        //println(semana[dia])
    }
    //reversa()
}

fun reversa(){
    val palabra = "palabrota"
    val divididas = palabra.toList()
    println(divididas)

    for(letra in divididas.size -1 downTo 0)
        println(divididas[letra])
}

