package POO

fun main() {
    //Instancia de un clase
    val persona = Persona("Leandro","Morales",19)
    persona.mostrarDatos()
    persona.edadFinal = 18
    persona.mostrarDatos()
    val cancion1 = Cancion(
        "Follow you",
        "Bring Me The Horizon",
        'R'
    )
    println(cancion1.mostrarCanciones())
    val cancion2 = Cancion(
        "Enemy",
        "Imagine Dragons",
        'R',
        150.0f,
        5
    )
    println(cancion2.mostrarCanciones())

    val cancion3 = Cancion(
        "Clausura",
        "Quirquiña"
    )//Aunque no mandes el terce parámetro género
    //Como en tu construcro has creado un parametro
    //un valor pordefecto, si te olvidas o no mandas
    //asume ese valor que pusiste por defecto
println(cancion3.mostrarCanciones())

    val cancion4 = Cancion(
        genero = 'R',
        duracion = 200.0f,
        titulo = "Lamento Boliviano",
        valoracion = 5,
        autor = "Enanitos Verdes"
    )
    println(cancion4.mostrarCanciones())
}