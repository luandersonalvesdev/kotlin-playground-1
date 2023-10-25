import applyTax

fun calculateNewSalary(currentSalary: Double): Double {
    val newSalary: Double = if (currentSalary <= 300.0) {
        currentSalary + applyTax(currentSalary, 0.50)
    } else if (currentSalary > 1000.0) {
        currentSalary + applyTax(currentSalary, 0.05)
    } else if (currentSalary > 300.0 && currentSalary <= 500.0) {
        currentSalary + applyTax(currentSalary, 0.40)
    } else if (currentSalary > 500.0 && currentSalary <= 700.0) {
        currentSalary + applyTax(currentSalary, 0.30)
    } else if (currentSalary > 700.00 && currentSalary <= 800.0) {
        currentSalary + applyTax(currentSalary, 0.20)
    } else {
        currentSalary + applyTax(currentSalary, 0.10)
    }

    return newSalary
}

fun main() {
    TODO("Use essa função para rodar o codigo principal")
}