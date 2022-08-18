//Variables globales

var total = 0

//Cuando una variable global que no cambia
//y previamente ya sabes que valor tiene
//se sugiere usar la palabra reservada const

const val PI = 3.1415

fun main(){
    val esEstudiante = true
    var precio = 6.99f

    //cuando no van a inicializar una variable al definirla
    //necesariamente tienen que indicar su tipo de dato

    val cantidad: Int
    cantidad = 65

    total += 1
    total.inc()//+1

    var a = 5
    val b = 10
    val suma = a + b
    a.plus(b)

    val elemento: Any

    val potencia: String?
    potencia = null

    println(a.plus(b))
}