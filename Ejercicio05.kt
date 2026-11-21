fun main() {
    var notificaciones: Boolean = false
    var modoOscuro: Boolean = false

    println("MENU DE CONFIGURACION")
    println("1. Activar notificaciones")
    println("2. Desactivar notificaciones")
    println("3. Activar modo oscuro")
    println("4. Consultar informacion de la aplicacion")
    println("5. Salir")
    print("Elige una opcion: ")

    val opcion: Int = readln().toInt()

    when (opcion) {
        1 -> {
            notificaciones = true
            println("Notificaciones activadas.")
        }
        2 -> {
            notificaciones = false
            println("Notificaciones desactivadas.")
        }
        3 -> {
            modoOscuro = true
            println("Modo oscuro activado.")
        }
        4 -> println("Aplicacion de ejemplo - version 1.0")
        5 -> println("Saliendo de la aplicacion...")
        else -> println("Opcion no valida.")
    }

    println("\nESTADO FINAL")
    println("Notificaciones: $notificaciones")
    println("Modo oscuro: $modoOscuro")
}