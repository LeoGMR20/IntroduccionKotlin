fun main() {
    val nombres = setOf("Alfredo", "Luis", "Luis", "Belen")
    println(nombres)

    //Sets mutables

    val numeros = mutableSetOf(1, 2, 2, 4, 5, 2, 3, 6, 3, 7)
    println(numeros)

    numeros.sum()
    val pares = numeros.filter {
        //predicado es que la última línea de código que tiene
        //sea el retorno true or false
        val a = 0
        val b = 10
        it % 2 == 0
    }

    println(pares)

    val numerosEjer = mutableSetOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14)
    /*val primos = mutableSetOf<Int>()

    for(num in numerosEjer){
        var cont = 0;
        for (i in 1 .. num){
            if (num % i == 0){
                cont += 1
            }
        }
        if (cont <= 2){
            primos.add(num)
        }
    }

    println(primos)*/

    val numerosPrimos = numerosEjer.filter {
        var esPrimo = true
        for (i in 2..it/2){
            if (it % i == 0){
                esPrimo = false
                break
            }
        }
        esPrimo
    }
    println(numerosPrimos)
}