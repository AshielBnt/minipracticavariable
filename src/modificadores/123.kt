package modificadores


class dado{
    private var valor: Int = 1
    fun tirar(){
        valor= ((Math.random()* 6)+ 1).toInt()
    }
    fun imprimir(){
        separador()
        println("valor del dado: $valor")
        separador()
    }
    private fun separador()=
        println("**************************************************")
}
fun main(parametro: Array <String>){
    val dado1 = dado()
    dado1.tirar()
    dado1.imprimir()
}
