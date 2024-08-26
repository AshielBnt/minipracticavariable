package constructores

class triangulo(var lado1: Int,var lado2: Int, var lado3 : Int){
    fun ladomayor(){
        print("lado mayor: ")
        when{
            lado1 > lado2 && lado1 > lado3 -> println(lado1)
            lado2 > lado3 -> println(lado2)
            else -> println(lado3)
        }
    }
    fun equilatero(){
        if (lado1 == lado2 && lado1 == lado3)
            print("es equilatero")
        else
            print("no es equilatero")
    }
}
fun main(parametro: Array <String>){
    val triangulo1 = triangulo(12,45,24)
    triangulo1.ladomayor()
    triangulo1.equilatero()
}