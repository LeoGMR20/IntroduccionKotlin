package POO.Herencia
/*
* 1) Hereadar de persona.
* 2) Deben pillar 2 atributos que tien en particular solamente un jefe de carrera
* 3) Sobreesriban los métodos del padre - mostrarInformacion()
* 4) Para el jefe de carrera el bono se calcula:
* sacando el 15% del salario total ganado y adicionando a ese 15%
* un  número alteatorio entre 1000 y 5000 bs
* 5) busquen una manera de calcular la sanción
* 6) la sanción y el bono deben afectar directamente al salario ganado
* por parte del jefe de carrera
*/
class JefeCarrera(
    nombre: String,
    apellido: String,
    experiencia: Int,
    area: String,
    salario: Int,
    tiempoCargo: Int, //años en el cargo
    especializaciones: List<String>
): Persona(nombre, apellido, experiencia, area, salario) {
    //Atributos

    var tiempoCargo: Int
    var especializaciones = listOf<String>()

    init {
        this.tiempoCargo = tiempoCargo
        this.especializaciones = especializaciones
        this.bono = calcularBono()
        this.salario += this.bono
        this.sancion = calcularSanciones(5,2)
    }

    override fun mostrarInformacion(): String {
        //return super.mostrarInformacion()
        return """
            El nombre completo es: $nombre $apellido
            Tiene $experiencia años de experiencia
            trabaja en el área de $area
            y gana un salario de Bs. $salario
            tiene especializaciones en: ${especializaciones.joinToString()}
            y lleva en el cargo $tiempoCargo años
            Pero tiene una sanción de $sancion por atrasos y/o faltas al trabajo
        """.trimIndent()
    }

    override fun calcularBono(): Int {
        //return super.calcularBono()
        return (this.salario * 0.15).toInt() + aumentoAleatorio(1000, 5000)
    }

    override fun calcularSanciones(numAtrasos: Int, numFaltas: Int): Int {
        //return super.calcularSanciones()
        return ((this.salario * 0.025).toInt() * numAtrasos) +  ((this.salario * 0.05).toInt() * numFaltas)
    }

    //Aumento del salario de forma aleatoria

    fun aumentoAleatorio(inicio: Int, fin: Int):Int {
        require(inicio<= fin) { "Illegal Argument" }
        return (inicio..fin).random()
    }
}