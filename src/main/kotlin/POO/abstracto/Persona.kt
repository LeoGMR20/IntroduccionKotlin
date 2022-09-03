package POO.abstracto

import java.time.LocalDate

/*
Las clases abstractas -> modelos genéricos
que van a servir de base y con reglas, características y políticas
a clases que usen este modelo de referencia (Hereden)
Combinación de reglas del juego o conceptos sin implementarse
con comportamientos y atributos ya implementados
para definir una clase abstracta usas la palabra reservada abstract
una clase abstract no se puede instanciar
*/
//No recomiendo que una clase abstracta definan constructor primario
abstract class Persona {
    //Atributos
    //Definir que caracteristicas son obligatorias

    abstract var nombre: String
    abstract var apellido: String
    abstract var fechaNacimiento: LocalDate
    abstract var genero: Char
    var edad: Int? = null //mucho cuidado con el control de nulidad

    //Comportamientos
    //Combinación de funcionalidad y conceptos

    open fun mostrarInformacion() {
        val datos = """
            Tus datos son: $nombre $apellido
            Tu género es: $genero
            Naciste el: $fechaNacimiento
        """.trimIndent()
        println(datos)
    }

    protected fun calcularEdad(): Int = LocalDate.now().year - fechaNacimiento.year

    abstract fun getHorasTrabajadas(): Int

    abstract fun calcularRendimiento()
}