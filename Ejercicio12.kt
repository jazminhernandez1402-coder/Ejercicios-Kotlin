class Bateria {
    private var porcentaje: Double = 100.0

    fun consultarPorcentaje(): Double {
        return porcentaje
    }

    fun consumir(cantidad: Double) {
        if (cantidad < 0) {
            println("Error: la cantidad a consumir no puede ser negativa.")
        } else if (cantidad > porcentaje) {
            println("Error: no hay bateria suficiente (disponible: $porcentaje %).")
        } else {
            porcentaje -= cantidad
            println("Se consumio $cantidad %.")
        }
    }

    fun cargar(cantidad: Double) {
        if (cantidad < 0) {
            println("Error: la cantidad a cargar no puede ser negativa.")
        } else if (porcentaje + cantidad > 100) {
            println("Error: la carga superaria el 100%.")
        } else {
            porcentaje += cantidad
            println("Se cargo $cantidad %.")
        }
    }
}

fun main() {
    val bateria = Bateria()
    println("Bateria inicial: ${bateria.consultarPorcentaje()} %")

    bateria.consumir(40.0)
    println("Bateria actual: ${bateria.consultarPorcentaje()} %")

    // Pruebas con valores incorrectos
    bateria.consumir(-5.0)
    bateria.consumir(80.0)

    bateria.cargar(20.0)
    println("Bateria actual: ${bateria.consultarPorcentaje()} %")

    bateria.cargar(50.0)
    println("Bateria final: ${bateria.consultarPorcentaje()} %")
}