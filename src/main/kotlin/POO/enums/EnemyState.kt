package POO.enums

/*
Enum: es  una clase que tiene una colección de valores ya defefinidos
holder o contenedor de categorias que no deberina en ningun momento
constantes -> convencion te sugerimos que uses cada valor en mayusculas
cuando defines un enum deberias darle un nombre muy detallado que explique
que valores contiene o que refiere a un listado categorico

*/

enum class EnemyState {
    IDDLE, //animacion por defecto
    WALK,
    PATROL,
    RUN,
    ATTACK,
    POWER_ATTACK,
    DASH,
    DIE
}