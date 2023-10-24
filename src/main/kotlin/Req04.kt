fun calculateAverage(number1: Double, number2: Double): Double = (number1 + number2) / 2

fun calculateDifference(number1: Double, number2: Double): Double {
    val bigger = if (number1 > number2) number1 else number2
    val smaller = if (number1 < number2) number1 else number2
    return bigger - smaller
}

fun calculateProduct(number1: Double, number2: Double): Double = number1 * number2

fun calculateDivision(number1: Double, number2: Double): Double? {
    if (number2 == 0.0) return null
    return number1 / number2
}

fun main() {
    TODO("Use essa função para rodar o codigo principal")
}