package retorno


fun perime(la1: Int): Int{
    return (la1 * 4)
}
fun main (parametro: Array <String>){
    print("ingrese la medida de los lados del cuadrado")
    val lado1 = readln().toInt()
    val perimetro = perime(lado1)
    print("el perimetro es $perimetro")
}
