fun sumar(a: Double, b: Double): Double {
    return a + b
}

fun restar(a: Double, b: Double): Double {
    return a - b
}

fun multiplicar(a: Double, b: Double): Double {
    return a * b
}

fun dividir(a: Double, b: Double): Double {
    return a / b
}

fun main() {
    println("CALCULADORA")
    println("1. Sumar")
    println("2. Restar")
    println("3. Multiplicar")
    println("4. Dividir")
    print("Elige una operacion: ")
    val opcion: Int = readln().toInt()

    print("Primer numero: ")
    val a: Double = readln().toDouble()
    print("Segundo numero: ")
    val b: Double = readln().toDouble()

    when (opcion) {
        1 -> println("Resultado: ${sumar(a, b)}")
        2 -> println("Resultado: ${restar(a, b)}")
        3 -> println("Resultado: ${multiplicar(a, b)}")
        4 -> {
            if (b == 0.0) {
                println("Error: no se puede dividir entre cero.")
            } else {
                println("Resultado: ${dividir(a, b)}")
            }
        }
        else -> println("Opcion no valida.")
    }
}