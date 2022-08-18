fun main(){

    //Para leer datos por teclado e introducirlos en consola}
    //se usa la función readln() que por defecto trae un String

    val numero = readln().toInt()
    val par:Int
    val numero1 = readln().toInt()
    val numero2 = readln().toInt()
    val menor: Int
    if (numero % 2 == 0) {
        println("El número $numero es par")
    } else {
        println("El número $numero es impar")
    }

    //Cuando el proceso o tu código verdadero o falso es de un sola línea
    //Puedes obviar las llaves, incluso si te entra el campo puedes ponerlo en una sola línea

    if (numero % 2 == 0)
        par = numero
    else
        par = 0
    //Kotlin permite que el resultado de una condicional, tanto por true o false,
    //sea asignado directamente a una variable

    print("Caso ubicar el menor -> ")
    menor = if (numero1 < numero2) numero1 else numero2
    println("El menor de los números es: $menor")

    //when -> switch-case
    //nota va de un rango de 0 a 10, donde a partir de 6 apruebas
    val nota = 8

    when (nota) {
        0, 1, 2, 3, 4, 5 -> { println("Usted a reprobado :( XD") }
        6, 7, 8, 9, 10 -> println("Usted a aprobado :)")
        else -> println("Usted es un genio!!")
    }

    val resultado: Int
    val operacion = "suma"
    resultado = when(operacion) {
        "suma" -> 5 + 6
        "resta" -> 5 - 6
        "multiplicacion" -> 5 * 6
        "division" -> 5 / 6
        else -> 5 % 10
    }
}