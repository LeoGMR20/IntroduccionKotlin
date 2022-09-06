package POO.enums

import java.time.LocalDate
import java.time.Month

fun main() {
    var enemyState = EnemyState.IDDLE
    val collider = 50
    enemyState = if (collider < 100) EnemyState.ATTACK else EnemyState.WALK

    val fecha = LocalDate.of(
        2021,
        Month.AUGUST,
        16
    )

    val color = ColorCategories.GREEN.hexCode
    println(color)

    val conexionCode = ConnectionResponses.PERMISSION_DENIED.responseCode
    val mensajeCode = ConnectionResponses.INTERNAL_ERROR.message
    val peticiones = ConnectionResponses.PERMISSION_DENIED.getCountIntents()

    println(conexionCode)
    println(mensajeCode)
    println(peticiones)
}