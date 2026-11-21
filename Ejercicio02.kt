fun main() {
    println("CALCULADORA DE ALMACENAMIENTO")

    print("Capacidad total del dispositivo (GB): ")
    val capacidad: Double = readln().toDouble()

    print("Espacio ocupado por aplicaciones (GB): ")
    val aplicaciones: Double = readln().toDouble()

    print("Espacio ocupado por fotografias (GB): ")
    val fotografias: Double = readln().toDouble()

    print("Espacio ocupado por videos (GB): ")
    val videos: Double = readln().toDouble()

    if (capacidad <= 0 || aplicaciones < 0 || fotografias < 0 || videos < 0) {
        println("Datos invalidos: la capacidad debe ser mayor a 0 y los espacios no pueden ser negativos.")
        return
    }

    val usado: Double = aplicaciones + fotografias + videos

    if (usado > capacidad) {
        println("Datos invalidos: el espacio ocupado supera la capacidad total.")
        return
    }

    val disponible: Double = capacidad - usado
    val porcentaje: Double = (usado / capacidad) * 100

    println("\nRESULTADOS")
    println("Espacio utilizado: $usado GB")
    println("Espacio disponible: $disponible GB")
    println("Porcentaje ocupado: $porcentaje %")
}