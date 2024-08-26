package arrays

fun main(parametro: Array <String>){
    val sueldos: IntArray
    sueldos = IntArray(5)

    for (i in 0..4){
        print("ingrese sueldo")
    sueldos[i] = readln().toInt()
    }
    for (i in 0..4){
        println(sueldos[i])
    }
}