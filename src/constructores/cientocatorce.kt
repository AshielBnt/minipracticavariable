package constructores

class triangulof(var lado1: Int,var lado2: Int, var lado3 : Int){
    constructor():this(0,0,0){
        print("ingrese el primer lado")
        val lado1 = readln().toInt()
        print("ingrese el segundo lado")
        val lado2 = readln().toInt()
        print("ingrese el tercer lado")
        val lado3 = readln().toInt()

    }
    fun ladomayor(){
        print("lado mayor: ")
        when{
            lado1 > lado2 && lado1 > lado3 -> println(lado1)
            lado2 > lado3 -> println(lado2)
            else -> println(lado3)
        }
        fun equilaterob(){
            if (lado1 == lado2 && lado1 == lado3)
                print("es equilatero")
            else
                print("no es equilatero")
        }
    }
    fun main(parametro: Array <String>){
        val trianguloff = triangulof()
        trianguloff.ladomayor()

    }
}
