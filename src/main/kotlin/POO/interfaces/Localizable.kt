package POO.interfaces

//Conjunto de metodos: los métodos solo eran abstractos o conceptos...
//Aplicables a nivel de cualquier clase...
//Se pueden pensar como una especia de multiherencia
//representan las reglas del juego --> CONTRATOS!!!!
//Los comportamientos de las interfaces son obligatorios de implementar
/*
Interfaces 2.0 --- Final de losfinales
1) Las interfaces permiten atributos .. que pueden ser asbtractos
2) Las interfaces ahora permiten que desarrolles la logica de la funcion dentro de su estructora
Ojo: en lo posible trat de aplicar conceptos abstractos a la hora de definir comportamiento
    solo cuando veas que el comportamiento no va a variar o será muy similar al momento de
    implementar aplica la lógica en la interfaz
*/
//Herencia: misma naturaleza dependecia directa de padre e hijo
//Interfaz: comportamientos es lo que mas andas ajustando y cambiando en tu proyecto
// muchas veces son comportamientos parecidos o bajo el mismo criterio
// puedas implementar ello en cualquier clase de tu software
interface Localizable {
    abstract var latitud: Double
    abstract var longitud: Double

    //Comportamientos
    abstract fun calculatePositionGps(): String

    open fun showInformation():String{
        return """
            Tu latitud es: $latitud
            Tu longitud es: $longitud
            Estás en Bolivia
        """.trimIndent()
    }
}