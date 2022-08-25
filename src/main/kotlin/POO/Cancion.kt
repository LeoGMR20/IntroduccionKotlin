package POO

//En kotlin existen 2 tipos de construtores
//Primarios los que van entre parentesis luego del nombre de la clase
//Secundarios que son constructores complementarios que van dentro
//de la clase con la palabra reservada constructor
/*
Cliente les pide que ergistren cancionse:donde puedan tener
informacion del titulo de la cancion, el artista, el fenero
pero adicionalmente te indica que en ciertos casos puede haber
canciones que tengan informacion sobre su duracion y su valoracion
*/
class Cancion(
    val titulo: String,
    val autor: String,
    val genero: Char = 'R'
) {
    //Atributos

    var duracion:Float = 0.0f
    var valoracion: Int = 0

    //Constructores secundarios si son necesarios
    //:this() es lo que necesita tu constructor primario para crear tus propios construcores
    constructor(
        titulo: String,
        autor: String,
        genero: Char = 'R',
        duracion: Float,
        valoracion: Int
    ): this(titulo,autor,genero) {
        //Proceso del constructor
        //La vieja escula
        this.valoracion = valoracion
        this.duracion = duracion
    }
    //Métodos
    fun mostrarCanciones(): String = "La cancion es $titulo escrita por $autor"
}