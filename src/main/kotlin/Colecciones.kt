fun main(){
    //Lista Mutable
    val nombres = mutableListOf("Luis", "Alejandro", "Yamir", "Alfredo", "Hugo")
    val notas = mutableListOf<Int>() // cuando no tiene elementos al inicio
    //Agregar elementos

    nombres.add("Hannes") //Agrega un elemento al final de la lista
    nombres.add(1,"Zaira")
    println(nombres)
    //quitar elementos
    nombres.remove("Alejandro")//busca ese elemento, si hay lo quita
    nombres.removeAt(2)//remueve el elemento de la posición que indicas
    println(nombres)

    //listas inmutables
    //no puedes usar ni add ni remove ni cambiar los valores inciales

    val valores = listOf(10,20,30,40,50)
    recorrerLista(valores)

    val duplicados = listOf(10,10,100,100,60,658,68,68)

    quitarDuplicados(duplicados)
}

fun recorrerLista(lista: List<Int>) {
    //el conocido foreach que recibe una función como parámetro en casos complejos
    //foreach -- indice 0 --> it = 1 -- indice 1 --> it = 2

    lista.forEach{
        print("${it} ")
    }
    println()
}

//Resolución ejercicio 2 práctica
//dado un array quitar los duplicados y mostrar los elementos
//en formato de string

fun quitarDuplicados(numeros: List<Int>) {
    //Programación funcional a su máxima expresión
    val resultado = numeros.distinct().sorted().joinToString()
    //Segunda manera
    val resultado2 = numeros.toSet().sorted().joinToString()
    println(resultado)
    println(resultado2)
}