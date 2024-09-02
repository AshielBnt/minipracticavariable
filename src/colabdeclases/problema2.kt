package colabdeclases

class socio(val nombre : String, val antiguedad : Int)

class club(val socio1 : socio, val socio2 : socio, val socio3: socio){
    fun imprimirsociomayor(){
        var sociomayor = socio1

        if (socio2.antiguedad > sociomayor.antiguedad){
            sociomayor = socio2
        }
        if (socio3.antiguedad > sociomayor.antiguedad){
            sociomayor = socio3
        }
        println("el socio mas antiguo es ${sociomayor.nombre}")

    }
}
fun main(){
    val socio1 = socio("Ana", 4)
    val socio2 = socio("Luis", 5)
    val socio3 = socio("Pope",1)
    val club = club(socio1,socio2,socio3)
    club.imprimirsociomayor()
}

