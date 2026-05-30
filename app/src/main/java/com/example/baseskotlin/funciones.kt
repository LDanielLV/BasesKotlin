package com.example.baseskotlin

fun main() {
//funcionBasica()
//funcionParametrosEntrada("daniel",28)
//operacionesParametrosEntrada(10,5)
    val resultadoDeSuma = suma(5, 8)
    println(resultadoDeSuma)//10
    val resultadoResta = resta(30,20)
    println(resultadoResta) //13

}

//funciones con los datos dentro de la misma
fun funcionBasica() {
    val num1: Int = 5
    val num2: Int = 10
    println("Hola, me llamo daniel")
    println("Tengo 28 años")
    println(num1 + num2)
}

//funcion con parametros de entrada
fun funcionParametrosEntrada(nombre: String, edad: Int) {
    println("Tu nombre es $nombre y tienes $edad de edad")
}

fun operacionesParametrosEntrada(num1: Int, num2: Int) {
    println("la suma es ${num1 + num2}")
    println("la resta es ${num1 - num2}")
    println("la division es ${num1 / num2}")
    println("la multiplicacion es ${num1 * num2}")
}

//funciones con parametros de salida
fun suma(num1: Int, num2: Int): Int {
    return num1 + num2
}
fun resta(num1: Int,num2: Int):Int{
    return num1-num2
}