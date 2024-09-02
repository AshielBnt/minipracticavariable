package colabdeclases

class cliente(var nombre: String, var monto: Float){
    fun depositar(monto : Float){
        this.monto += monto
    }

    fun extraer(monto: Float){
        this.monto -= monto
    }
    fun imprimir(){
        println("$nombre tiene depositado la suma de $monto")

    }

}
class banco{
val cliente1: cliente = cliente("JUAN",0f)
    val cliente2 : cliente = cliente("ANA", 0f)
    val cliente3 : cliente = cliente("LUIS", 0f)
    val cliente4 : cliente = cliente("LYAN", 0f)

    fun operar(){
        cliente1.depositar(100f)
        cliente2.depositar(150f)
        cliente3.depositar(200f)
        cliente3.extraer(150f)
        cliente4.depositar(500f)
        cliente4.extraer(100f)

    }

    fun depositostotales(){
        val total = cliente1.monto + cliente2.monto + cliente3.monto + cliente4.monto
        println("el total del dinero en el banco es de : $total")
        cliente1.imprimir()
        cliente2.imprimir()
        cliente3.imprimir()
        cliente4.imprimir()
    }
}
 fun main(parametro: Array <String>){
     val banco1 = banco()
     banco1.operar()
     banco1.depositostotales()
 }