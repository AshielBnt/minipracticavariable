package retorno

fun retorno(la1 : Int, la2 : Int): Int{
    return la1 * la2
}
fun main (parametro: Array <String>){
    print("ingrese el valor del lado 1 del primer rectangulo  ")
    val lado11 = readln().toInt()
    print("ingrese el segundo valor del lado 2 del primer rectangulo  ")
    val lado12 = readln().toInt()
    val primercua = retorno(lado11, lado12)
    print("la superficie es de    $primercua  ")
    print("ingrese el primer lado del segundo rectangulo  ")
    val lado21 = readln().toInt()
    print("ingrese el segundo lado del segundo rectangulo  ")
    val lado22 = readln().toInt()
    val super2  = retorno(lado21 , lado22 )
    print("la superficie del segundo rectangulo es $super2    ")
    if (super2 > primercua)
        print("el segundo rectangulo es mayor, mide $super2    ")
    else
        print("el primer rectangulo es mayor, mide $primercua   ")
}