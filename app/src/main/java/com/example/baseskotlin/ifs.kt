package com.example.baseskotlin

fun main(){
//ifSimpleString()
//ifSimpleInt()
//ifParametrosDeEntrada("Daniel",18)
//ifParImpar(8032)
//edadParaTomar()
}

fun ifSimpleString(){
    val nombre = "daniel"

    if (nombre == "daniel"){
        println("hola $nombre")
    }
    else{
        println("tu nombre no es daniel")
    }
}

fun ifSimpleInt(){
    val num1 = 7

    if (num1 <= 5){
        println("tu numero es menor a 6")
    }
    else{
        println("tu numero es mayor o igual a 6")
    }
}

fun ifParametrosDeEntrada(nombre:String,edad: Int){

    if (edad<18){
        println("hola $nombre tienes $edad y eres menor de edad")
    }
    else{
        println("hola $nombre tienes $edad y eres mayor de edad")
    }
}

fun ifParImpar(numero:Int){
    val residuo = numero%2
    if(residuo == 0){
        println("$numero es par")
    }
    else{
        println("$numero es impar")
    }
}

fun edadParaTomar(){
    val edad = 15
    val permiso = true

    if (edad >= 18 || permiso){
        println("puedes tomar")
    }
    else{
        println("no puedes tomar")
    }
}
