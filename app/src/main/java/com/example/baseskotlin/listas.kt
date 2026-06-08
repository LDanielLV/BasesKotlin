package com.example.baseskotlin

fun main() {
//inmutableList()
    mutableList()
}

fun inmutableList() {
    val semana: List<String> =
        listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

//    println(semana.size)
//    println(semana)
//    println(semana[2])
//    println(semana.last())
//    println(semana.first())
//    println(semana.random())

    val filtradoContenga = semana.filter { it.contains("s", ignoreCase = true) }
    println("Los dias que tienen la letra s son $filtradoContenga")

    val filtradoInicie = semana.filter { it.startsWith("m", ignoreCase = true) }
    println("Los dias que inician con m son $filtradoInicie")

    val filtradoTermine = semana.filter { it.endsWith("s", ignoreCase = true) }
    println("Los dias que terminan en s son $filtradoTermine")


}

fun mutableList() {
    val semana: MutableList<String> =
        mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

//    println(semana.size)
//    println(semana)
//    println(semana[2])
//    println(semana.last())
//    println(semana.first())
//    println(semana.random())

    //semana[2] = "Reemplazado"
    //semana.add(0,"Firstday")
    //semana.add("Lastday")
    //println(semana)

    val filtradoContenga = semana.filter { it.contains("s", ignoreCase = true) }
    println("Los dias que tienen la letra s son $filtradoContenga")

    val filtradoInicie = semana.filter { it.startsWith("m", ignoreCase = true) }
    println("Los dias que inician con m son $filtradoInicie")

    val filtradoTermine = semana.filter { it.endsWith("s", ignoreCase = true) }
    println("Los dias que terminan en s son $filtradoTermine")

}