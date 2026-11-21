fun main() {
    // val: no se puede reasignar despues
    val nombre: String = "Hannia Hernandez Cruz"
    val correo: String = "jazminhernandez@gmail.com"
    val telefono: String = "8125114979"

    var edad: Int = 23
    var cuentaActiva: Boolean = true
    var satisfaccion: Double = 9.5

    println("INFORMACION DEL USUARIO")
    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Correo: $correo")
    println("Telefono: $telefono")
    println("Cuenta activa: $cuentaActiva")
    println("Calificacion de satisfaccion: $satisfaccion")

    edad = 24
    cuentaActiva = false
    satisfaccion = 8.0

    println("\nINFORMACION ACTUALIZADA")
    println("Nueva edad: $edad")
    println("Cuenta activa: $cuentaActiva")
    println("Nueva calificacion de satisfaccion: $satisfaccion")
}