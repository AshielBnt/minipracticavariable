package funcionUnicaExpresionjajajajaajaaaaaaa

fun convertircastelano(valor: Int) = when (valor){
    1 -> "uno"
    2 -> "dos"
    3 -> "tres"
    4 -> "cuatro"
    5 -> "seis"
    else -> "error"

}
fun main (parametro: Array <String>){
    for (i in 1..6)
        println(convertircastelano(i))
}