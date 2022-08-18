fun main(){
    mostrarMensaje("hola")
    showMessage("hola2 jaja")
    println(calcularNumeros(1,2))
    println(restarNumeros(80,55))

    println("*****SOBRECARGA*****")
    println("El precio total es: ${calcularPrecioFinal(10,0.32)}")
    println("El precio total es: ${calcularPrecioFinal(10)}")
    println("El precio total es: ${calcularPrecioFinal(10.1)}")

    println("*****PROMOCIONES*****")
    procesarOferta("Galleta","2% descuento","hasta verano")
    procesarOferta("InkaCola")

    //Tu tienes el producto y tienes la duración y solo quieres usar
    //la promoción que está por defecto
    //Ustedes pueden definir sus parametros indicando el nombre del parametro
    //de manera explicita, siempre que el parametro tu le hayas definido
    //que tenga valor por defecto

    procesarOferta("Leche Pil", duracion = "hasta otonio")
    procesarOferta("Dulces", duracion = "hasta abril", promocion = "4% descuento")
}

//Funciones

//Necesariamente deben explicitar o indicar el tipo
//de dato de un parámetro en su funcion, si es que lo tiene
//no es necesario que escribas el tipo Unit

fun mostrarMensaje(mensaje: String): Unit{
    val cadena = mensaje + ", fin del mensaje."
    println(cadena)
}

fun showMessage(mensaje: String) {
    println("$mensaje, fin del mensaje.")
}

//Funciones que retornan un valor
//Si la funcion tiene un proceso sencillo -> que solo tiene una linea de código
//y esa linea de código es el retorno de dato
//se puede resumir de 2 formas, ver las funciones que continuan
//a este ejemplo

fun calcularNumeros(numero1: Int, numero2:Int): Int {
    return numero1 + numero2
}

fun restarNumeros(numero1: Int, numero2: Int): Int = numero1 - numero2

//Sobrecarga de funciones

fun calcularPrecioFinal(precio: Int): Double{
    val total = precio + (precio * 0.15)
    return total
}

fun calcularPrecioFinal(precio: Double): Double = precio + (precio * 0.15)

fun calcularPrecioFinal(precio: Int, iva: Double):Double = precio + (precio * iva)

//Funcion para generar una promoción en productos
//Ustedes pueden definir parámetros con valores por defecto en las funciones
//quiere decir que le asignas un valor que lo va a tomar cuando tu no envies
//esos parámetros

fun procesarOferta(producto: String,
                   promocion: String = "sin promoción",
                   duracion: String = "hasta fin de anio"){
    val resultado = "El producto $producto $promocion $duracion."
    println(resultado)
}