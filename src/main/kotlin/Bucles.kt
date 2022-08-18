fun main(){
    val ejemplo = arrayOf(1,2, true, "hola", "adios", 3.6f)
    val precios = arrayOf(10,30,20,50)

    val numeros = intArrayOf(1,2,3,4,5,6,7,8)
    val nombres = arrayOf("Dereck", "Leandro", "Juan Pablo")
    val impuestos = doubleArrayOf(2.6,5.1456, 0.1546)
    val cantidades = arrayOf(5)
    val vacios = emptyArray<Float>()

    val numeros2 = IntArray(8) {i: Int -> i.inc()}

    //FOR
    //Rango

    val rango = (1 .. 10) // 1,2,3,4,5,6,7,8,9,10
    val valorAleatorio = rango.random()

    //1ra forma

    println("PRIMERA FORMA")
    for (i in 0 .. numeros.size - 1)
        println(numeros[i])

    //2da forma

    println("SEGUNDA FORMA")
    for (i in 0 until numeros.size)
        println(numeros[i])

    //3ra forma

    println("TERCERA FORMA")
    for (i in numeros.indices)
        println(numeros[i])

    //4ta forma

    println("CUARTA FORMA")
    for (numero in numeros)
        println(numero)

    //WHILE

    println("WHILE")
    var iterador = 0
    while (iterador < numeros.size){
        println(numeros[iterador])
        iterador++ //inc no estas asignando nada, no incrementa permanentemente el valor
    }
}