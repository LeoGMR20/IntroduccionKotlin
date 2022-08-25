package POO

//Producto de la abstracción
//Si luego de la clase pones parentesis y dentro defines parámetros de tipo val o var
//Estas creando un constructor que automaticamente crea atribytps por ti
class Persona(//Esto es un constructor
    val nombre: String,
    val apellido: String,
    edad: Int//Aun no es un atributo
) {
    //Atributos - características
    var edadFinal = edad //Creandro un atributo manualmente asignado un parámetro que llego con el constructor

    //Si necesitas que el constructor realice mas proceso que solo
    //inicializar variable como llamar a un método o ejecutar un flujo de codigo
    //para ese constructor debes lamar a algo conocido como el bloque init

    init {
        //Procesos
        //Esto ocurre cuando creas la instancia de tu clase
        println("Proceso ejecutado")
    }

    //Comportamientos - Métodos
    fun mostrarDatos() {
        println("La persona es: $nombre $apellido, y tiene $edadFinal años, bienvenido")
    }
}