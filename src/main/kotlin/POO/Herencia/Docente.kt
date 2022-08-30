package POO.Herencia
//La herencia se realiza usando el opereador : nombre de la clase Padre
//acompañado de su constructor si es necesario con parametros
class Docente(
    nombre: String,
    apellido: String,
    experiencia: Int,
    area: String,
    salario: Int,
    materias: List<String>
): Persona(nombre, apellido, experiencia, area, salario) {
    var materias = listOf<String>()
    init {
        this.materias = materias
        this.bono = calcularBono()
        this.salario += this.bono
    }

    //Polimorfismo múltiples formas de representar un método
    //Super hace referencia al padre
    override fun mostrarInformacion(): String {
        //return super.mostrarInformacion()
        return """
            El nombre completo es: $nombre $apellido
            Tiene $experiencia años de experiencia
            trabaja en el área de $area
            y gana un salario de Bs. $salario
            y dicta las materias de ${materias.joinToString()}
        """.trimIndent()
    }

    override fun calcularBono(): Int {
        //return super.calcularBono()
        return this.salario + (this.salario / 2)
    }
}