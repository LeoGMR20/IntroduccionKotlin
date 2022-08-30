package POO.Herencia

fun main() {
    val docente = Docente(
        "Shirley",
        "Salazar",
        15,
        "Sistemas",
        10000,
        listOf("Programación Web 2", "Programación Web 1", "Ingeniería de Software","Taller de Tesis")
    )

    val jefeCarrera = JefeCarrera(
        "Pedro",
        "Perez",
        5,
        "Sistemas",
        10000,
        5,
        listOf("Maestría en docencia", "Doctorado en redes y telecomunicaciones")
    )
    //println(docente.mostrarInformacion())
    println(jefeCarrera.mostrarInformacion())
}