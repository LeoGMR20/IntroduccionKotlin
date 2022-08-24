//Colecciones: Listas
fun main(){
    //Listas no mutable
    val nombres = listOf("Luis","Alfredo","Hannes","Hugo")
    //Listas mutables
    val precios = mutableListOf(5.99,10.0,11.5,2.5,4.99)
    precios.add(20.99)
    precios.add(1,6.5)
    precios.remove(11.5)
    precios.removeAt(3)
    println(precios)

    //Programacion funcional con las colecciones
    //Por ejemplo funciones de Orden Superior

    //total a pagar de la lista de precios

    println("El total a pagar será: ${precios.sum()}")
    precios.average()//Promedio
    println(precios.random())

    //Invertir una lista

    val nombresInvertidos = nombres.reversed()
    println(nombresInvertidos)

    //Ordenar una lista de mayor a menor

    println(precios.sortedDescending().joinToString())

    //Funciones de orden superior que se pueden aplicar a colecciones
    //Filter, map, reduce
    //Filter

    val numeros = listOf(2,3,4,1,6,10,7,5)

    //Ejemplo: muestren los elementos paraes de la lista

    val numerosPares = numeros.filter {
        it % 2 == 0
    }
    println(numerosPares)
    val edades= listOf(20,29,19,20,22,26,17)
    val mayores = edades.filter { it > 18 }
    println(mayores)

    val menores = edades.filter {
        edad -> edad <= 18
    }

    println(menores)

    //Reduce

    val sumaNumeros = numeros.reduce{ acumulador, elemento -> acumulador+ elemento }
    println(sumaNumeros)

    //Map

    val resultado = numeros.map{
        numero -> Math.pow(numero.toDouble(),2.0)
    }
    println(resultado)

    //Ejercicio con precios

    val porcentaje = precios.map {
        precioRed -> precioRed * 0.15
    }

    val incrementoPrecios = precios.map{
        precio -> precio + precio * 0.15
    }

    println(precios)
    println(porcentaje)
    println(incrementoPrecios)

    println("La lista tiene: ${numeros.count()} elementos")
    val cantidadPares = numeros.count {
        numero -> numero % 2 == 0
    }
    println("La cantidad de pares es: $cantidadPares")

    //Ordenamiento de acuerdo a sus propios criterios

    val ordenadosPropio = numeros.sortedBy {
        numero -> numero % 2 == 0
    }

    println(numeros)
    println(ordenadosPropio)

    val total = numeros.maxOf {
        it % 2 == 0
    }

    println(total)

    //De la lista de dedades indiqueme al de mayor y menor edad
    println("El más joven es: ${edades.sorted().first()}")
    println("El más adulto es: ${edades.sorted().last()}")
}