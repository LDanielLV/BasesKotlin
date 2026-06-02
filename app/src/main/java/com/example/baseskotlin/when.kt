package com.example.baseskotlin

fun main(){
//getMonth(6)
//getTrimester(6)
//getSemester(12)
//claseSocial(50000)

}

fun getMonth(month:Int){

    when(month){
        1 -> {
            println("enero")
            println("enero")
            println("enero")
            println("enero")
        }
        2 -> println("febrero")
        3 -> println("marzo")
        4 -> println("abril")
        5 -> println("mayo")
        6 -> println("junio")
        7 -> println("julio")
        8 -> println("agosto")
        9 -> println("septiembre")
        10 -> println("octubre")
        11 -> println("noviembre")
        12 -> println("diciembre")
        else -> println("solo existen 12 meses")
    }
}

fun getTrimester(month:Int){
    when(month){
        1,2,3 -> println("su mes pertenece al primer trimestre")
        4,5,6 -> println("su mes pertenece al segundo trimestre")
        7,8,9 -> println("su mes pertenece al tercer trimestre")
        10,11,12 -> println("su mes pertenece al cuarto trimesstre")
        else -> println("no existe este trimestre")
    }
}

fun getSemester(month: Int){
   when(month){
       in 1..6 -> println("primer semestre")
       in 7..12 -> println("segundo semestre")
      !in 1..12 -> println("semestre no valido")
   //else -> println("Solo existen dos semestres")
   }
}

fun claseSocial(salario: Int){
    when(salario){
        in 1..20000 -> println("clase baja")
        in 20001..100000-> println("clase media")
        in 100001..Int.MAX_VALUE -> println("clase alta")
        else -> println("salario no valido")
    }
}