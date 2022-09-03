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
}