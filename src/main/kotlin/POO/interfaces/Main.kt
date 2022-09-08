package POO.interfaces

fun main() {
    val vehiculo = Vehiculo()
    println(vehiculo.calculatePositionGps())
    println(vehiculo.showInformation())
    vehiculo.enableMovement()
}