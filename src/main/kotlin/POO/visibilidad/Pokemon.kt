package POO.visibilidad

//ojo que a nivel de archivo se considera que si tienes varias clases o
//variables y funciones estas estan en un mismo contexto
class Pokemon {

    //Sirve para que la variable se inicialice despues
    //nos permite ir a la inmutabilidad
    //en android lo usaremos para delegar la responsabilidad de inicializar
    //una varable despues a riesgo suyo...
    //private lateinit var evolution: Int

    //private: solamente es accesible por los miembros de la propia clase
    //nadie mas lo puede hacer...
    private var powerUp: Int = 0
    //private val bonus = Bonus()
    //protected: es un nivel de acceso donde solo los miembros de la propia
    //clase y sus descendientes pueden utilizar estos recursos
    protected var damage: Int = 0
    //public: es el más flexible y permite acceso desde cualquier
    //lado de tu proyecto o codigo
    //public es por defecto en kotlin
    var health: Int = 100

    //Un cuarto tipo de acceso que kotlin maneja
    //se llama internal - y en un acceso a nivel de modulos
    //para ustedes es como un public la diferencia es que a nivel
    //de modulos significa acceso de terceros y otras librerias
    //Módulo - introduccion (nombre del proyecto)
    internal fun generateAttack(): Int = (20..50).random()
}

/*private class Bonus {
    val life = 100
}*/