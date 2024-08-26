package constructores

class puntodelplano(val x: Int, val y: Int){
    fun cuadrante(): String{
        return when{
            x > 0 && y > 0 -> "1º Cuadrante"
            x < 0 && y > 0 -> "2º Cuadrante"
            x < 0 && y < 0 -> "3º Cuadrante"
            x > 0 && y < 0 -> "4º Cuadrante"
            x == 0 && y == 0 -> "Origen"
            x == 0 -> "Eje Y"
            y == 0 -> "Eje X"
            else -> "En algun lugar del plano"
        }
    }
}
fun main(parametro: Array <String>){
   val punto1 = puntodelplano(0,5)
   val punto2 = puntodelplano(-4,8)
   val punto3 = puntodelplano(2,2)
   val punto4 = puntodelplano(-1,-3)
   val punto5 = puntodelplano(3,-6)
    println("punto1 esta en ${punto1.cuadrante()} ")
    println("punto2 esta en ${punto2.cuadrante()}")
    println("punto3 esta en ${punto3.cuadrante()}")
    println("punto4 esta en ${punto4.cuadrante()}")
    println("punto5 esta en ${punto5.cuadrante()}")
}