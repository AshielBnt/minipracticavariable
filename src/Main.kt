/*
fun main(parametro: Array<String>) {
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    val mayor = if (valor1 > valor2) valor1 else valor2
    println("El mayor entre $valor1 y $valor2 es $mayor")
}

 */
/*

fun main(parametro: Array<String>) {
    print("Ingrese un valor entero:")
    val valor = readln().toInt()
    val resultado = if (valor % 2 == 0) {
        print("Cuadrado:")
        valor * valor
    } else {
        print("Cubo:")
        valor * valor * valor
    }
    print(resultado)
}

 */
fun main() {
    var numero1: Int
    do {
        print("Ingrese un número entre 1 y 99: ")
        numero1 = readLine()?.toIntOrNull() ?: 0
    } while (numero1 < 1 || numero1 > 99)
    val digitos = if (numero1 < 10) 1 else 2
    println("La cantidad de dígitos del número ingresado es: $digitos")
}