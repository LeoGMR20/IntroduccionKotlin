package POO.abstracto

import java.time.LocalDate

//Para usar algo abstracto se sigue la línea
//de la herencia con el operador:

class Cajero(
    nombre: String,
    apellido: String,
    fechaNacimiento: LocalDate,
    genero: Char
): Persona() {
    override var nombre: String = ""
    override var apellido: String = ""
    override var fechaNacimiento: LocalDate = LocalDate.now()
    override var genero: Char = 'N'

    init {
        this.nombre = nombre
        this.apellido = apellido
        this.fechaNacimiento = fechaNacimiento
        this.genero = genero
        edad = calcularEdad()
    }

    override fun getHorasTrabajadas() = (3..7).random()

    override fun calcularRendimiento() {
        val potenciaTrabajo = (100..500).random()
        val horasTrabajadasMES = getHorasTrabajadas() * 21
        val rendimiento = (potenciaTrabajo + horasTrabajadasMES) / 100
        println("Tu rendimiento del mes fue de $rendimiento")
    }

    //Sobreescritura

    override fun mostrarInformacion() {
        super.mostrarInformacion()
        println("Tu trabajaste: ${this.getHorasTrabajadas()}")
    }
}