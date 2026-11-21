open class Dispositivo(val marca: String, val modelo: String) {
    fun mostrarInformacion() {
        println("Marca: $marca")
        println("Modelo: $modelo")
    }
}

class Smartphone(marca: String, modelo: String, val numeroTelefono: String) : Dispositivo(marca, modelo) {
    fun hacerLlamada() {
        println("Llamando desde el numero $numeroTelefono...")
    }
}

class Tablet(marca: String, modelo: String, val tamanoPantalla: Double) : Dispositivo(marca, modelo) {
    fun mostrarPantalla() {
        println("Pantalla de $tamanoPantalla pulgadas")
    }
}

fun main() {
    val telefono = Smartphone("Samsung", "Galaxy S23", "5512345678")
    val tableta = Tablet("Apple", "iPad Air", 10.9)

    println("SMARTPHONE")
    telefono.mostrarInformacion()
    telefono.hacerLlamada()

    println("\nTABLET")
    tableta.mostrarInformacion()
    tableta.mostrarPantalla()
}