package POO.singleton

fun main() {
    val producto1 = Producto("Lavadora", CategoriaProducto.ELECTRODOMESTICO.name, 499.99)
    val producto2 = Producto("XBOX Series S", CategoriaProducto.CONSOLA.name, 749.99)
    val producto3 = Producto("Xiaomi Redmi 10", CategoriaProducto.COMUNICACION.name, 199.99)
    //Singleton -> única instancia de una clase
    val carritoCompra = CarritoCompra //no pueden haber mas instancias de carrito de compra
    carritoCompra.productos = mutableListOf(producto1, producto3)
    println("Los productos seleccionados para compra son: ${carritoCompra.getNombresProductos().joinToString()}")
    val carritoCompra2 = CarritoCompra
    carritoCompra2.productos = mutableListOf(producto2, producto3)
    println("Los productos seleccionados para compra son: ${carritoCompra2.getNombresProductos().joinToString()}")
    println("Los productos seleccionados para compra son: ${carritoCompra.getNombresProductos().joinToString()}")
}