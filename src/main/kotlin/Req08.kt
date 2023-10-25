fun calculateSumEven(numbers: List<Int>): Int = numbers.filter { it % 2 == 0 }.reduce { acc, it -> acc + it }

fun calculateSumOdd(numbers: List<Int>): Int = numbers.filter { it % 2 != 0 }.reduce { acc, it -> acc + it }

fun main() {
    TODO("Use essa função para rodar o codigo principal")
}