fun main(){
    //Mapas inmutables
    val productos = mapOf<String, Float>(
        "gaseosa" to 4.99f,
        "galleta" to 6.00f,
        "leche" to 3.5f
    )

    println(productos)
    //no pueden introducri, eliminar y modificar lo que han creado en el diccionario

    //Mpas Mutables
    //A parte de los mapas hay mas coleciones no tan usuadas
    //una de ellas se conoce como Pair pareja o par
    val estudiantes = mutableMapOf<Int, String>(
        Pair(1234,"Jose"),
        Pair(5432,"Hannes"),
        Pair(9897,"Zaira"),
        Pair(5556,"Alejandro"),
        Pair(3333,"Laura"),
        Pair(3334,"Leandro")
    )
    estudiantes.put(5421,"Hugo")
    estudiantes.remove(5556)
    estudiantes.forEach{
        val llave = it.key
        val valor = it.value
        println("La llave es: $llave y su valor $valor")
    }
    //Sumar el total de los productos
    val total = productos.values.sum()
    val aprobados = estudiantes.filter {
        it.value.lowercase().contains("l")
    }
    println("Aprobados: ${aprobados}")
    estudiantes.keys.average()
}