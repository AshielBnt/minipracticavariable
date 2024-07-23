package retorno

fun largo(nombre : String): Int{
    return nombre.length
}
fun main(parametro: Array <String>){
    print("ingrese un nombre")
    val nombre1 = readln()
    print("ingrese otro nombre")
    val nombre2 = readln()
    if (largo(nombre1) == largo(nombre2))
        print("ambos nombres tienen la misma cantidad de letras")
    else
        if (largo(nombre1) > largo(nombre2) )
            print("$nombre1 es mas largo")
    else
        print("$nombre2 es mas largo")

}