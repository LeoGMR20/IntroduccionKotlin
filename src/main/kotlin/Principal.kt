// Los programas en Kotlin tienen un archivo
// principal que es el que se va a ejecutar
// El entry point donde arranca

fun main(){
    val numero1: Int = 10
    var numero2 = 20

    numero2 = 25
    //numero1 = 15 -> error

    val nota1: Float = 41.5f
    val nota2 = 78.362541
    val esEstudiante = true
    val nombre = "Leandro"
    val apellido = "Morales"
    val character = 'a'
    var ejemplo = 15

    //ejemplo = "jueves" -> error

    println("Su nombre es: " + nombre + " " + apellido)
    println("Su nombre es: $nombre $apellido, bienvenido")
    println("La suma de sus notas: ${nota1 + nota2}")

    //${estudiante.mostrarNotas()} -> para imprimir objetos de una clase
}