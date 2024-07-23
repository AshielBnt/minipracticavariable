package funcionUnicaExpresionjajajajaajaaaaaaa

fun retornarmayo(v1 : Int, v2 : Int) = if (v1 > v2) v1 else v2

fun main (parametro: Array <String>){
    print("ingrese el primer valor")
    val valor1 = readln().toInt()
    print("ingrese el segundo valor")
    val valor2 = readln().toInt()
    println("el mayor es ${retornarmayo(valor1, valor2)}")

}