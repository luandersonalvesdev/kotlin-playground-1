fun applyTax(price: Double, tax: Double): Double = price * tax

fun calculateConsumerPrice(factoryCost: Double): Double {

    val finalPrice: Double = if (factoryCost <= 12000.0) {
        factoryCost + applyTax(factoryCost, 0.05)
    } else if (factoryCost > 12000.0 && factoryCost <= 25000.0) {
        factoryCost + applyTax(factoryCost, 0.10) + applyTax(factoryCost, 0.15)
    } else {
        factoryCost + applyTax(factoryCost, 0.15) + applyTax(factoryCost, 0.20)
    }
    return finalPrice
}

fun main() {
    TODO("Use essa função para rodar o codigo principal")
}