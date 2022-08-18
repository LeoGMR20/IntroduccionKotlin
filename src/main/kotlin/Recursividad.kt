//Recursividad
//Ejemplo simple
/*
dado un array de precios obteng el total simulando que es un carrito de compras
y va a entregar el valor a pagar
*/

fun main(){
    val precios = floatArrayOf(10.0f, 5.99f, 2.99f, 3.0f, 15.0f)
    println("El total a pagar es: ${calcularPrecios(precios)}")
    println("El total a pagar es: ${calcularPreciosRecursivo(precios, precios.size - 1)}")
}

fun calcularPrecios(precios:FloatArray):Float{
    var total = 0f
    for (precio in precios){
        total += precio
    }
    return total
}

fun calcularPreciosRecursivo(precios: FloatArray, maxIndex: Int): Float{
    //Caso base
    if (maxIndex == 0) return precios[0]
    //Caso recursivo
    //la función se llama a si misma
    return precios[maxIndex] + calcularPreciosRecursivo(precios, maxIndex - 1)
}