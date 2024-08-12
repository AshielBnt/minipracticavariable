package poo

class persona{
    var nombre: String = ""
    var edad: Int = 0


fun inicializar(nombre : String, edad: Int){
    this.nombre = nombre
    this.edad = edad
}

fun imprimir(){
    println("nombre y edad: $nombre y tiene $edad años")
}

fun esmayor(){
    if (edad >= 18)
        println(" $nombre es mayor de edad")
    else
        println("$nombre es menor de edad")
}}

fun main(parametro: Array <String>){
        val persona1 : persona
        persona1= persona()
        persona1.inicializar("juan",12)
        persona1.imprimir()
        persona1.esmayor()
        val persona2: persona
        persona2 = persona()
        persona2.inicializar("ana",50)
    persona2.imprimir()
    persona2.esmayor()

    }

