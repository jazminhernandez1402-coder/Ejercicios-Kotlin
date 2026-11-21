fun main() {
    var consumoTotal: Double = 0.0

    println("REGISTRO DE CONSUMO DE BATERIA (bateria inicial: 100%)")

    for (periodo in 1..5) {
        var valido: Boolean = false

        while (!valido) {
            print("Porcentaje consumido en el periodo $periodo: ")
            val consumo: Double = readln().toDouble()

            if (consumo < 0) {
                println("Dato invalido: no puede ser negativo.")
            } else if (consumoTotal + consumo > 100) {
                println("Dato invalido: el consumo acumulado no puede superar 100%.")
            } else {
                consumoTotal += consumo
                valido = true
            }
        }
    }

    val bateriaRestante: Double = 100 - consumoTotal

    println("\nRESULTADOS")
    println("Consumo total: $consumoTotal %")
    println("Bateria restante: $bateriaRestante %")
}