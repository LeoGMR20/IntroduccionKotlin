package POO.alcance

//Astronomia
class Estrella(
    val id: Long,
    val nombre: String
) {
    var galaxia: String? = null
    var tamanio: Long? = null
    var distancia: Int? = null

    fun calcularSuperNova(): Long {
        val indiceExplosion = (100..500).random()
        return tamanio!! * indiceExplosion
    }

    fun calcularVidaUtil(): String = "La estrella morirá en ${(10..100).random()} años"
}