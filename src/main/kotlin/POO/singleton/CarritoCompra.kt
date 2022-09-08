package POO.singleton
//Singleton: es un patrón de diseño de software.
//sirve para limitar cierta clase a solo tener una instrancia en todo
//el proyecto. Se tuiliza en un ambito global
//en Kotlion facilmente se implementa usadno la palabra reservada object
object CarritoCompra {
    var productos = mutableListOf<Producto>()

    fun getNombresProductos(): List<String> {
        val nombres = productos.map {
            it.nombre
        }
        return nombres
    }
}