fun validarNombre(nombre: String): Boolean {
    return nombre.isNotBlank()
}

fun validarCorreo(correo: String): Boolean {
    return correo.contains("@")
}

fun validarEdad(edad: Int): Boolean {
    return edad >= 18
}

fun validarContrasena(contrasena: String): Boolean {
    return contrasena.length >= 8
}

fun main() {
    print("Nombre: ")
    val nombre: String = readln()
    print("Correo electronico: ")
    val correo: String = readln()
    print("Edad: ")
    val edad: Int = readln().toInt()
    print("Contrasena: ")
    val contrasena: String = readln()

    val nombreValido: Boolean = validarNombre(nombre)
    val correoValido: Boolean = validarCorreo(correo)
    val edadValida: Boolean = validarEdad(edad)
    val contrasenaValida: Boolean = validarContrasena(contrasena)

    println("\nRESULTADO DE LAS VALIDACIONES")
    println("Nombre valido: $nombreValido")
    println("Correo valido: $correoValido")
    println("Edad valida: $edadValida")
    println("Contrasena valida: $contrasenaValida")

    if (nombreValido && correoValido && edadValida && contrasenaValida) {
        println("Registro aceptado: todos los datos cumplen las reglas.")
    } else {
        println("Registro rechazado: revisa los datos marcados como false.")
    }
}