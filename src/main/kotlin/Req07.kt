fun calculateAverage(ages: List<Int>): Double = ((ages.reduce{acc, age -> acc + age}) / ages.size).toDouble()

fun countPeopleWeightHeight(weights: List<Double>, heights: List<Double>): Int {
    var total = 0

    for (i in 0 until weights.size) {
        if (weights[i] > 90.0 && heights[i] < 1.50) {
            total += 1
        }
    }

    return total
}

fun calculatePercentageAgeHeight(ages: List<Int>, heights: List<Double>): Int {
    var total = 0

    for (i in 0 until ages.size) {
        if (ages[i] in 10..30 && heights[i] > 1.90) {
            total += 1
        }
    }

    return ((total * 100) / ages.size)
}

fun main() {
    TODO("Use essa função para rodar o codigo principal")
}