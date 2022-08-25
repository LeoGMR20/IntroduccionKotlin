//Funciones Lambda, de flecha o anonimas
fun main() {
    //Variables de tipo función
    //Firma de una funcion es la estructura que hace unica a esa funcion
    //(Int, Int): Int -> Int o String // Estructura
    val suma: (Int,Int)-> Int = { x, y -> x + y}
    //val x: Int, val y: Int -> x + y
    println(suma(4,5)) //invocando a la función que está en esa variable
    suma.invoke(4,5)
}