package POO.enums

//Las enum class pueden tener tanto atributos como metodos en su cuerpo
//igual que una clase comun
//los atributos y metodos que quisieras poner en el cuerpo de la clase
//deben ir al final despues de la lista de categorias
//y excepcionalmente luego del ultimo valor de tu lista, colocas ';'
//para indicar que luego de ello habrá mas contenido
enum class ConnectionResponses(
    val message: String
){


    SUCCESS("La conexión ha sido exitosa!!!"){
        override var responseCode: Int = 200

        override fun showServerLog(): String {
            return """
                exito exitoso
                exitaso jajaja
            """.trimIndent()
        }

        override fun getCountIntents(): Int = (1..5).random()
    },
    PERMISSION_DENIED("Tu usuario no tiene permisos para acceder a este recurso"){
        override var responseCode: Int = 403

        override fun showServerLog(): String {
            return """
                sin permisos
                we jajajaja
            """.trimIndent()
        }

        override fun getCountIntents(): Int = (1..3).random()
    },
    INTERNAL_ERROR("El servidor tuvo un problema, intenta más tarde"){
        override var responseCode: Int = 500

        override fun showServerLog(): String {
            return """
                fallo falloso del
                servidaso ajajajajajd
            """.trimIndent()
        }

        override fun getCountIntents(): Int = (1..5).random()
    };

    abstract var responseCode: Int
    val pingConnection: Int = 110

    abstract fun showServerLog(): String
    abstract fun getCountIntents(): Int
    open fun showServerConnection(): String {
        return "https://www.heroku.com"
    }
}