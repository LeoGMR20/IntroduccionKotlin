package POO.abstracto

import java.time.LocalDate

fun main() {
    val cajero = Cajero(
        "Efrain",
        "Choque",
        LocalDate.of(1978,3,15),
        'M'
    )
    cajero.mostrarInformacion()
}