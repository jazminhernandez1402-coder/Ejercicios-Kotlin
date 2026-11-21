class ProductoDigital(
    val nombre: String,
    val categoria: String,
    val precio: Double,
    val tamanoMB: Double
) {
    fun mostrarInformacion() {
        println("Nombre: $nombre")
        println("Categoria: $categoria")
        println("Precio: $$precio")
        println("Tamano: $tamanoMB MB")
    }
}

fun main() {
    val producto1 = ProductoDigital("Editor de fotos", "Aplicacion", 99.0, 150.5)
    val producto2 = ProductoDigital("Aventura Espacial", "Juego", 199.0, 1200.0)
    val producto3 = ProductoDigital("Curso de Kotlin", "Educacion", 349.0, 800.0)

    println("PRODUCTO 1")
    producto1.mostrarInformacion()

    println("\nPRODUCTO 2")
    producto2.mostrarInformacion()

    println("\nPRODUCTO 3")
    producto3.mostrarInformacion()
}