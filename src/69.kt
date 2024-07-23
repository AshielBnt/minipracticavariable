package retorno

fun retornarSuperficie(ladop: Int): Int{
    val sup = ladop * ladop
    return sup
    //>,  >

    //

}
fun main(parametro: Array <String>){
    print("ingrese el valor del lado del cuadrado")
    val lado = readln().toInt()
    val superficie = retornarSuperficie(lado)
    println("la superficie del cuadrado es de $superficie")

}