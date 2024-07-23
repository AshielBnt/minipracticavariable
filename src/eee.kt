package retorno

fun calcularPromedio(a: Int, b: Int, c: Int): Int = (a + b + c) / 3


fun main() {
    val num1 = 10
    val num2 = 20
    val num3 = 30

    val promedio = calcularPromedio(num1, num2, num3)
    println("El promedio de $num1, $num2, y $num3 es $promedio")
}