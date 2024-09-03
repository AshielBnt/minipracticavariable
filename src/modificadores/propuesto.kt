package modificadores

import kotlin.random.Random

class enteros{
    private var arreglo : IntArray = IntArray(5)
    init {
        cargarvaloresent()
    }
    private fun  cargarvaloresent(){
        for (i in arreglo.indices){
            arreglo[i]  = Random.nextInt(0,11)
        }
    }
    fun mostrararreglo(){
        println("arreglo :                   ")
        for (i in 0 until 5)
            print("${arreglo[i]}")
    }
    fun mostrarmayorele(){
        var mayor = arreglo[0]
        for (i in 1 until 5)
            if (arreglo[i] > mayor ){
                mayor = arreglo[i]
            }

println("             el mayor elemento es $mayor                 ")
    }
    fun mostrarmenor(){
        var menor = arreglo[0]
        for (i in 1 until 5)
            if (arreglo[i] < menor){
                menor = arreglo[i]
            }
        println("el menor elemento es $menor")
    }
}
fun main(parametro: Array <String>){
    val miarreglo = enteros()
    miarreglo.mostrararreglo()
    miarreglo.mostrarmayorele()
    miarreglo.mostrarmenor()
}