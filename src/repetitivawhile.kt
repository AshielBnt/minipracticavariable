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
/*
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

 */
/*
 fun main() {
    var mayoresOIgualesA7 = 0
    var menoresA7 = 0
    var contador = 0

    // Solicitar ingresar 10 notas
    while (contador < 10) {
        println("Ingrese la nota ${contador + 1}:")
        val nota = readLine()?.toIntOrNull() ?: 0

        // Contar cuántas notas son mayores o iguales a 7 y cuántas son menores
        if (nota >= 7) {
            mayoresOIgualesA7++
        } else {
            menoresA7++
        }

        contador++
    }

    // Informar los resultados
    println("Cantidad de notas mayores o iguales a 7: $mayoresOIgualesA7")
    println("Cantidad de notas menores a 7: $menoresA7")
}

fun main() {
    println("Ingrese el número de personas:")
    val n = readLine()!!.toInt()
    var sumaAlturas = 0.0
    var contador = 0

    while (contador < n) {
        println("Ingrese la altura de la persona ${contador + 1}:")
        val altura = readLine()!!.toDouble()
        sumaAlturas += altura
        contador++
    }

    val promedio = if (n > 0) sumaAlturas / n else 0.0
    println("La altura promedio es: $promedio")
}

fun main() {
    // Lectura de número de empleados
    print("Ingrese el número de empleados: ")
    val n = readLine()!!.toInt()

    var contadorMenorIgual300 = 0
    var contadorMayor300 = 0
    var gastoTotal = 0

    var i = 0
    while (i < n) {
        print("Ingrese el sueldo del empleado ${i + 1}: ")
        val sueldo = readLine()!!.toInt()

        if (sueldo in 100 >.. >300) {
            contadorMenorIgual300++
        } else if (sueldo > 300 && sueldo <= 500) {
            contadorMayor300++
        }

        gastoTotal += sueldo
        i++
    }

    println("Número de empleados que cobran entre $100 y $300: $contadorMenorIgual300")
    println("Número de empleados que cobran más de $300: $contadorMayor300")
    println("Gasto total de la empresa en sueldos: $${gastoTotal}")
}
fun main() {
    val totalTerminos = 25
    var i = 1
    var termino = 11

    while (i <= totalTerminos) {
        println(termino)
        termino += 11
        i++
    }
}
/*
fun main() {
    val limite = 500
    var numero = 8

    while (numero <= limite) {
        print("$numero ")
        numero += 8
    }

 */
}
/*
fun main() {
    val size = 5
    var sumaLista1 = 0
    var sumaLista2 = 0

    println("Cargando valores para la Lista 1:")
    var i = 0
    while (i < size) {
        print("Ingrese el valor ${i + 1} para la Lista 1: ")
        sumaLista1 += readLine()!!.toInt()
        i++
    }

    println("Cargando valores para la Lista 2:")
    i = 0
    while (i < size) {
        print("Ingrese el valor ${i + 1} para la Lista 2: ")
        sumaLista2 += readLine()!!.toInt()
        i++
    }

    println("Suma de la Lista 1: $sumaLista1")
    println("Suma de la Lista 2: $sumaLista2")

    if (sumaLista1 > sumaLista2) {
        println("Lista 1 mayor")
    } else if (sumaLista2 > sumaLista1) {
        println("Lista 2 mayor")
    } else {
        println("Listas iguales")
    }
}
if (valor % 2 == 0) //Si el if se verifica verdadero luego es
par. En kotlin con la estructura repetitiva while
fun main() {
    print("Ingrese la cantidad de números a verificar: ")
    val n = readLine()!!.toInt()

    var contadorPares = 0
    var contadorImpares = 0
    var i = 0

    while (i < n) {
        print("Ingrese el número ${i + 1}: ")
        val numero = readLine()!!.toInt()

        if (numero % 2 == 0) {
            contadorPares++
        } else {
            contadorImpares++
        }

        i++
    }

    println("Cantidad de números pares: $contadorPares")
    println("Cantidad de números impares: $contadorImpares")
}



 */




 */