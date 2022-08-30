package POO.Herencia

//para habilitar la herencia tienen que utilizar la palabra reservadea open
//para todos los elemetos que quieres heredar
/*
* Sistema administratibo de la UNIVALLE donde deben considerar a todos los empleados posibles
* por empleado se entiende secreatarias, docentes, segunridad, jefes de carrera, etc.
* abstraido caracteristicas que los empleados tienen en común
*/
open class Persona (
    open val nombre: String,
    open val apellido: String,
    open val experiencia: Int,
    open val area: String,
    open var salario: Int
){
    //Atributos

    open var bono: Int = 0
    open var sancion: Int = 0

    //Metodos
    open fun mostrarInformacion() : String {
        //Existe un formato para formar strings de varias líneas
        //respeta los saltos de línea que se tengan y las separaciones
        //que generen usan """"""
        //.trimIndent() ->
        return """
            El nombre completo es: $nombre $apellido
            Tiene $experiencia años de experiencia
            trabaja en el área de $area
            y gana un salario de Bs. $salario
        """.trimIndent()
    }

    //Calcular un bono

    open fun calcularBono(): Int = this.salario + 150

    //Calcular sanciones

    open fun calcularSanciones(numAtrasos: Int, numFaltas: Int): Int = this.salario - 1000
}