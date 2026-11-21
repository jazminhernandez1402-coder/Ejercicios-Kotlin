fun main() {
    println("REGISTRO DE COMPRA")

    print("Nombre del producto: ")
    val producto: String = readln()

    print("Precio unitario: ")
    val precio: Double = readln().toDouble()

    print("Cantidad: ")
    val cantidad: Int = readln().toInt()

    // Cada importe se calcula por separado
    val subtotal: Double = precio * cantidad
    val iva: Double = subtotal * 0.14
    val total: Double = subtotal + iva

    println("\nDETALLE DE LA COMPRA")
    println("Producto: $producto")
    println("Precio unitario: $precio")
    println("Cantidad: $cantidad")
    println("Subtotal: $subtotal")
    println("IVA (14%): $iva")
    println("Total a pagar: $total")
}