package POO.alcance

fun main() {
    val estrella = Estrella(1,"Betelgeuse")
    //Funciones de Scope
    // aplican ciertas operaciones o permiten ciertas operaciones
    // en el ambito de un objeto de forma dinámica, ventajas: reduce el trabajo

    //Función Apply

    estrella.galaxia = "Vía Lactea"
    estrella.distancia = 5000000
    estrella.tamanio = 150
    estrella.apply {
        //el ambito de una clase de tipo Estrella
        galaxia = "Vía Lactea"
        distancia = 5000000
        tamanio = 150
    }

    with(estrella){
        //Estoy en el ambito de una estrella para plicar secuencialmente criterios en este objeto
        println("El nombre de la estrella es: $nombre")
        println(calcularSuperNova())
        println(calcularVidaUtil())
    }
}