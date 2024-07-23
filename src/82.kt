package retorno

fun calcularpromedio(a: Int, b: Int, c: Int) : Int{
    return  (a + b + c) /3
}
fun main (parametro: Array <String>){
    print("ingrese el primer numero")
    val val1 = readln().toInt()
    print("ingrese el segundo numero")
    val val2 = readln().toInt()
    print("ingrese el segundo numero")
    val val3 = readln().toInt()
    val promedio = calcularpromedio(val1 , val2 , val3)
    print("el promedio es de $promedio")

}