package metodos_SETYGET

class persona{
    var nombre: String = ""
        set(valor){
            field = valor.toUpperCase()
        }
        get() {
            return "("+ field + ")"
        }
    var edad : Int = 0
        set(valor){
            if (valor >= 0)
                field = valor
            else
                field= 0
        }
}
fun main(parametro: Array <String>){
    val persona1 = persona()
    persona1.nombre = "juan"
    persona1.edad = 23
    println(persona1.nombre)
    println(persona1.edad)
    persona1.edad = -50
    println(persona1.edad)
}