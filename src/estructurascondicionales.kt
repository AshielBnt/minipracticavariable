import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
import java.util.*

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

/*
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


 */
/*
fun main(parametro: Array<String>) {
    print("Ingrese primer valor:")
    val num1 = readln().toInt()
    print("Ingrese segundo valor:")
    val num2 = readln().toInt()
    print("Ingrese tercer valor:")
    val num3 = readln().toInt()
    if (num1 > num2 && num1 > num3)
        print(num1)
    else
        if (num2 > num3)
            print(num2)
        else
            print(num3);
}

 */
/*
fun main(parametro: Array<String>) {
    print("Ingrese día:")
    val dia = readln().toInt()
    print("Ingrese mes:")
    val mes = readln().toInt()
    print("Ingrese Año:")
    val año = readln().toInt()
    if (mes == 1 || mes == 2 || mes == 3)
    print("Corresponde al primer trimestre");
}
*/
/*
fun main() {
    // Formato de la fecha esperado
    val dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")

    // Solicitar al usuario que ingrese una fecha
    val scanner = Scanner(System.in)
    println("Ingrese una fecha en el formato dd/MM/yyyy:")
    val dateInput = scanner.nextLine()

    try {
        // Convertir la entrada en una instancia de LocalDate
        val inputDate = LocalDate.parse(dateInput, dateFormatter)

        // Verificar si la fecha corresponde a Navidad (25 de diciembre)
        if (inputDate.monthValue == 12 && inputDate.dayOfMonth == 25) {
            println("La fecha ingresada corresponde a Navidad.")
        } else {
            println("La fecha ingresada no corresponde a Navidad.")
        }
    } catch (e: DateTimeParseException) {
        println("Formato de fecha inválido. Por favor, ingrese la fecha en el formato dd/MM/yyyy.")
    }
}

 */
/*
fun main() {
    val scanner = Scanner(System.in)

    println("Ingrese el primer valor:")
    val value1 = scanner.nextInt()

    println("Ingrese el segundo valor:")
    val value2 = scanner.nextInt()

    println("Ingrese el tercer valor:")
    val value3 = scanner.nextInt()

    if (value1 == value2 && value2 == value3) {

        val cube = value1 * value1 * value1
        println("Los tres valores son iguales. El cubo del número es: $cube")
    } else {
        println("Los valores no son iguales. No se calcula el cubo.")
    }
}

 */
/*

fun main() {

    // Solicitar al usuario que ingrese tres números
    println("Ingrese el primer número:")
    val num1 = readln().toInt()

    println("Ingrese el segundo número:")
    val num2 = readln().toInt()

    println("Ingrese el tercer número:")
    val num3 = readln().toInt()

    // Verificar si los tres números son menores a 10
    if (num1 < 10 && num2 < 10 && num3 < 10) {
        // Imprimir la leyenda si la condición se cumple
        println("Todos los números son menores a diez")
    }
}

 */
/*
fun main() {
    val scanner = Scanner(System.in)

    // Solicitar al usuario que ingrese tres números
    println("Ingrese el primer número:")
    val num1 = scanner.nextInt()

    println("Ingrese el segundo número:")
    val num2 = scanner.nextInt()

    println("Ingrese el tercer número:")
    val num3 = scanner.nextInt()

    // Verificar si al menos uno de los números es menor a 10
    if (num1 < 10 || num2 < 10 || num3 < 10) {
        println("Alguno de los números es menor a diez")
    }

 *//*

fun main() {
    val scanner = Scanner(System.in)

    // Solicitar al usuario que ingrese las coordenadas del punto
    println("Ingrese la coordenada x (distinta de cero):")
    val x = scanner.nextInt()

    println("Ingrese la coordenada y (distinta de cero):")
    val y = scanner.nextInt()

    // Verificar que ambos valores sean distintos de cero
    if (x == 0 || y == 0) {
        println("Las coordenadas no deben ser cero.")
    } else {
        // Determinar en qué cuadrante se encuentra el punto
        val cuadrante = when {
            x > 0 && y > 0 -> "1º Cuadrante"
            x < 0 && y > 0 -> "2º Cuadrante"
            x < 0 && y < 0 -> "3º Cuadrante"
            x > 0 && y < 0 -> "4º Cuadrante"
            else -> "Error: Coordenadas no válidas"
        }

        // Imprimir el cuadrante correspondiente
        println("El punto ($x, $y) se encuentra en el $cuadrante.")
    }
}
*/
/*
fun main() {
    val scanner = Scanner(System.in)

    // Solicitar al usuario que ingrese tres valores enteros
    println("Ingrese el primer valor:")
    val num1 = scanner.nextInt()

    println("Ingrese el segundo valor:")
    val num2 = scanner.nextInt()

    println("Ingrese el tercer valor:")
    val num3 = scanner.nextInt()

    // Obtener el mayor de los tres valores usando if como expresión
    val mayor = if (num1 >= num2 && num1 >= num3) {
        num1
    } else if (num2 >= num1 && num2 >= num3) {
        num2
    } else {
        num3
    }

    // Obtener el menor de los tres valores usando if como expresión
    val menor = if (num1 <= num2 && num1 <= num3) {
        num1
    } else if (num2 <= num1 && num2 <= num3) {
        num2
    } else {
        num3
    }

    // Imprimir el mayor y el menor
    println("El mayor valor es: $mayor")
    println("El menor valor es: $menor")
}


 */
