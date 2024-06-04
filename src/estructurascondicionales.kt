/*
fun main(){
print("ingrese la primera nota")
    val nota1: Int = readln().toInt()
    print("ingrese la segumda nota")
    val nota2: Int = readln().toInt()
    print("ingrese la tercera nota")
    val nota3: Int = readln().toInt()
 val promedio = (nota1 + nota2 + nota3) / 3
    print(" su promedio es de $promedio y usted esta:  ")
    if (promedio >= 7)
        print(" promocionado ")
    else
        if (promedio >= 4)
            print(" regular ")
    else
        print(" reprobado ")



}

 */
/*
fun main(){
    print("ingrese la primera nota")
    val nota1: Int = readln().toInt()
    print("ingrese la segumda nota")
    val nota2: Int = readln().toInt()
    print("ingrese la tercera nota")
    val nota3: Int = readln().toInt()
    val promedio = (nota1 + nota2 + nota3) / 3
    val estado = if( promedio >= 7) "promocionado"
    else if(promedio >= 4 ) "regular" else "reprobado"

    print("el estado del alumno es $estado")




}
fun main() {
    // 1. Mostrar el mayor de tres números distintos.
    println("Ingrese tres números distintos:")
    print("Número 1: ")
    val num1 = readLine()!!.toInt()
    print("Número 2: ")
    val num2 = readLine()!!.toInt()
    print("Número 3: ")
    val num3 = readLine()!!.toInt()

    val mayor = if (num1 > num2 && num1 > num3) num1
    else if (num2 > num1 && num2 > num3) num2
    else num3

    println("El mayor de los tres números es: $mayor")
    fun main() {

    // 2. Determinar la cantidad de cifras de un número entero positivo de hasta tres cifras.
    print("Ingrese un número entero positivo de hasta tres cifras: ")
    val numero = readLine()!!.toInt()

    if (numero in 1..9) {
        println("El número tiene 1 cifra.")
    } else if (numero in 10..99) {
        println("El número tiene 2 cifras.")
    } else if (numero in 100..999) {
        println("El número tiene 3 cifras.")
    } else {
        println("Error: El número tiene más de 3 cifras o no es positivo.")
    }



 */


fun main() {
    // 3. Determinar el nivel de un postulante basado en el porcentaje de respuestas correctas.
    print("Ingrese la cantidad total de preguntas: ")
    val totalPreguntas = readLine()!!.toInt()
    print("Ingrese la cantidad de preguntas respondidas correctamente: ")
    val correctas = readLine()!!.toInt()

    if (totalPreguntas <= 0) {
        println("Error: La cantidad total de preguntas debe ser mayor a 0.")
        return
    }

    val porcentaje = (correctas.toDouble() / totalPreguntas) * 100

    val nivel = when {
        porcentaje >= 90 -> "Nivel máximo"
        porcentaje >= 75 -> "Nivel medio"
        porcentaje >= 50 -> "Nivel regular"
        else -> "Fuera de nivel"
    }

    println("El porcentaje de respuestas correctas es: ${"%.2f".format(porcentaje)}%")
    println("El nivel del postulante es: $nivel")
}
