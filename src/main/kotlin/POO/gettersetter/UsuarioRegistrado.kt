package POO.gettersetter

class UsuarioRegistrado {
    var usuario: Usuario? = null
        set(value) {
            field = if (usuario!!.esValido) value else null
        }
}