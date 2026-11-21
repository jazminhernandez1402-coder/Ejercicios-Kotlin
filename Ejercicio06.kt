fun main() {
    val contrasenaCorrecta: String = "kotlin246"
    val maximoIntentos: Int = 5
    var intentos: Int = 0
    var accesoPermitido: Boolean = false

    while (intentos < maximoIntentos && !accesoPermitido) {
        print("Ingresa la contrasena (intento ${intentos + 1} de $maximoIntentos): ")
        val contrasena: String = readln()
        intentos++

        if (contrasena == contrasenaCorrecta) {
            accesoPermitido = true
        } else {
            println("Contrasena incorrecta.")
        }
    }

    if (accesoPermitido) {
        println("Acceso permitido. Bienvenido.")
    } else {
        println("Acceso bloqueado: se agotaron los $maximoIntentos intentos.")
    }
}