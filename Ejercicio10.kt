class Usuario {
    var nombre: String = ""
    var correo: String = ""
    var edad: Int = 0
    var cuentaActiva: Boolean = false

    fun mostrarInformacion() {
        println("Nombre: $nombre")
        println("Correo: $correo")
        println("Edad: $edad")
        println("Cuenta activa: $cuentaActiva")
    }
}

fun main() {
    val usuario1 = Usuario()
    usuario1.nombre = "Andrea Lopez"
    usuario1.correo = "andrea@email.com"
    usuario1.edad = 20
    usuario1.cuentaActiva = true

    val usuario2 = Usuario()
    usuario2.nombre = "Carlos Perez"
    usuario2.correo = "carlos@email.com"
    usuario2.edad = 25
    usuario2.cuentaActiva = false

    println("USUARIO 1")
    usuario1.mostrarInformacion()

    println("\nUSUARIO 2")
    usuario2.mostrarInformacion()
}