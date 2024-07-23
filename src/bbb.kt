package retorno

fun perimetroCuadrado(lado: Int): Int = 4 * lado

fun main() {
    val lado = 5
    val perimetro = perimetroCuadrado(lado)
    println("El perímetro de un cuadrado con lado $lado es $perimetro")
}

