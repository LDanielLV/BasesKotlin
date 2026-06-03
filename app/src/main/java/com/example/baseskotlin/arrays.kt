package com.example.baseskotlin

fun main(){

    val semana = arrayOf("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo")

    //semana[2] ="valor cambiado"
    //println(semana[2])
    //println(semana[1]) //imprime el segundo valor en el arreglo --martes
    //println(semana.size) //devuelve cantidad de elementos --7
    //println(semana.indices) //devuelve el rango de posiciones --0...6

//    //recorro array y despliego todos los datos
//    for(dia in semana.indices){
//        println(semana[dia])
//    }
//
//    //recorro el array y despliego todos los datos y la posicion en el array
//    for((posicion, dia) in semana.withIndex()){
//        println("La posicion es $posicion y el dia es $dia")
//    }

    //filtro elementos que contengan la letra M
    val filtradosConM = semana.filter { it.contains("M", ignoreCase = true) }
    //println(filtradosConM)

    //filtro los dias que terminen con la letra O
    val filtradosTerminanConO = semana.filter { it.endsWith("o", ignoreCase = true) }
    //println(filtradosTerminanConO)

    //filtro los dias que tengan la letra s
    val filtrados = semana.filter { it.contains("S", ignoreCase = true) }
    //println(filtrados)

    //obtengo un valor aleatorio de mi arreglo
    val random = semana.random()
    //println(random)
}