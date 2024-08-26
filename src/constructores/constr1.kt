package constructores

class persona constructor(nombre: String, edad : Int){
    var nombre: String = nombre
    var edad : Int = edad

    init {
        if (this.edad <0)
            this.edad = 0
    }

    fun imprimir(){
        println("nombre : $nombre y tiene una edad de: $edad")

    }
    fun esmayo(){
        if (edad >= 18)
            println("es mayor de edad")
        else
            println("es menor de edad")
    }
}
fun main(parametro: Array <String>){
    val persona1 = persona("juan",12)
    persona1.imprimir()
    persona1.esmayo()
}