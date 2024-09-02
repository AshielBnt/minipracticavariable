package colabdeclases

class dado(var valor : Int){
    fun tirar(){
        valor = ((Math.random() * 6 ) + 1).toInt()
        imprimir()
    }
    fun imprimir(){
        println("valor del dado : $valor")
    }
}
class juego{
    val dado1 = dado(1)
    val dado2 = dado(1)
    val dado3 = dado(1)

    fun jugar() {
        do {
            dado1.tirar()
            dado2.tirar()
            dado3.tirar()

            if (dado1.valor == dado2.valor && dado2.valor == dado3.valor) {
                println("Ganó")
            } else {
                println("Perdió")
            }
        } while (dado1.valor != dado2.valor || dado2.valor != dado3.valor)
    }
}
fun main(parametro: Array <String>){
    val juegod1 = juego()
    juegod1.jugar()

}