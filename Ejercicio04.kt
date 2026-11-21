fun main() {
    print("Ingresa tu edad: ")
    val edad: Int = readln().toInt()

    if (edad < 0) {
        println("Edad invalida: no puede ser negativa.")
    } else if (edad >= 18) {
        println("Registro permitido: puedes continuar.")
    } else {
        println("Registro no permitido: debes tener al menos 18 anios.")
    }
}