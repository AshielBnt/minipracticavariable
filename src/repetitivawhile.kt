/*
fun main(){
    var x = 1
    while (x <= 100){
        println(x)
        x = x +1

    }

}

 */
/*
fun main (){

    print("ingrese un numero")
    val valor: Int = readln().toInt()
    var x = 1
    while ( x <= valor){
        println(x)
    x++
    }
}

 */
/*
fun main (){
    var x = 1
    var suma = 0
    while (x <= 10){
        print("ingrese el valor $x")
        val valor = readln().toInt()
        suma =  suma + valor
        x++
    }
    println("la suma de los 10 valores es $suma")
    val promedio = suma / 10
    println("el promedio es $promedio")


}

 */
fun main(){

    print("cuantas piezas va a procesar: ")
    val n = readln().toInt()
    var x = 1
    var cantidad = 0
    while (x <= n ){
        print("ingrese la medida de la pieza")
        val largo: Double = readln().toDouble()
        if ( largo >= 1.20 && largo <= 1.30){
            cantidad = cantidad +1

    }
        x++
         }
    print("la cantidad de piezas aptas son: $cantidad")
}