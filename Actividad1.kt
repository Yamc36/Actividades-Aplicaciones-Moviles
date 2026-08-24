fun main() {
    val nombreProducto: String = "Teclado Mecánico"
    val cantidad: Int = 3
    val precio: Double = 24990.0
    val disponible: Boolean = true
    val categoria: Char = 'P'

    var stockMinimo = 5

    val total = precio * cantidad

    println("========================")
    println("       PRODUCTO")
    println("========================")
    println("Producto: $nombreProducto")
    println("Precio: $precio")
    println("Cantidad: $cantidad")
    println("Disponible: $disponible")
    println("Categoría: $categoria")
    println("Total: $total")
    println("Stock mínimo: $stockMinimo")
}
