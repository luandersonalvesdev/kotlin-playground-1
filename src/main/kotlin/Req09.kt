fun calculateFinalPrice(carValue: Double, installment: Int, surcharges: Array<Double>): Double {
    val percent = when (installment) {
        12 -> surcharges[0]
        24 -> surcharges[1]
        36 -> surcharges[2]
        48 -> surcharges[3]
        60 -> surcharges[4]
        else -> 0.0
    }
    return if (percent != 0.0) (carValue + (carValue * percent)) else (carValue - (carValue * 0.20))
}

fun main() {
    TODO("Use essa função para rodar o codigo principal")
}