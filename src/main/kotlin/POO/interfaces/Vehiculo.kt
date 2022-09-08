package POO.interfaces

//Implementar interfaz usando operador:

class Vehiculo: Localizable, Security {
    override var latitud: Double = 0.0
    override var longitud: Double = 0.0
    override var redButton: Boolean = true
    var velocity = 0.0
    override fun calculatePositionGps(): String {
        latitud = (-20 .. -10).random().toDouble()
        longitud = (-80 .. -60).random().toDouble()
        return "$latitud° - $longitud°"
    }

    override fun showInformation():String{
        return super.showInformation()
    }

    override fun enableMovement() {
        velocity = if (!redButton) (10..20).random().toDouble()
        else 0.0
        val aceleration = if (!redButton) 1.0 else 0.0
        println("Tu velocidad de movimiento es: $velocity con un acelaracion de: $aceleration")
    }
}