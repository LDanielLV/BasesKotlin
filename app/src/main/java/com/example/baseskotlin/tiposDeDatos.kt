package com.example.baseskotlin

//variables
fun main(){

    val firstName: String = "Luis Daniel"
    val lastName: String = "Lopez Valencia"
    val month: String = "Junio"
    val year: Int = 1997
    val day: Int = 28
    val gender: String = "Masculino"
    val crybaby: Boolean = true
    val genderSymbol: Char = 'M'
    val weight: Double = 2.3

    //println("El bebe $firstName $lastName de genero $gender nacio el dia $day del mes $month del año $year")
    //El bebe Luis Daniel Lopez Valencia de genero Masculino nacio el dia 28 del mes Junio del a�o 1997
    operacionesNumericas()
}

fun operacionesNumericas(){

    val num1: Int = 20
    val num2: Int = 30
    val num3: Int = 10

    val suma: Int = num1+num2+num3
    println(suma) //resultado 60
    val resta: Int = num2-num3-num1
    println(resta) //resultado 0
    val division:Int = num2/num3
    println(division) //resultado 3
    val multiplicacion: Int =num1*num2*num3
    println(multiplicacion) //resultado 6000
    val modulo: Int = num2%num1
    println(modulo) //resultado 10
}