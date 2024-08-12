package poo

class alumnno {
    var nombre: String = ""
    var nota : Int = 0

    fun inicializar(){
        println("nombre del alumno  ")
        this.nombre = readln().toString()
        println("ingrese la nota del alumno  ")
        this.nota = readln().toInt()
    }
    fun imprimir(){
        println("nombre del estudiante: $nombre ")
        println("nota del estudiante : $nota")
    }
    fun desempeño(){
        when{
            nota >= 8 -> print("desempeño alto")
            nota  >= 5 -> print("desempeño medio")
            nota  >= 1 -> print("desempeño bajisimo compadre")


        }

    }
}
fun main(parametro: Array <String>){
    val alumno1 = alumnno()
    alumno1.inicializar()
    alumno1.imprimir()
    alumno1.desempeño()
print("////////////////////////////")


    val alumno2 = alumnno()
    alumno2.inicializar()
    alumno2.imprimir()
    alumno2.desempeño()
}