package modificadores

import nuevitopoo_llamadra.operaciones

class operaciones{
    private var valor1: Int = 0
    private var valor2 : Int = 0

    fun cargar(){
        print("ingrese primer valor : ")
        valor1 = readln().toInt()
        print("ingrese segundo valor : ")
        valor2 = readln().toInt()
        sumar()
        restar()
    }
    private fun sumar(){
        val suma = valor1 + valor2
        println("la suma de $valor1 mas $valor2 es $suma")
    }
    private fun restar(){
        val resta = valor1 - valor2
        println("la resta de $valor1 menos $valor2 es $resta")
    }
}
fun main(parametro: Array <String>){
    val operaciones1 = operaciones()
    operaciones1.cargar()
}