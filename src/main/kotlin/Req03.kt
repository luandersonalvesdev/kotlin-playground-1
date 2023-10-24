fun calculateYears(birthYear: Int, currentYear: Int): Int = currentYear - birthYear

fun calculateMonths(birthYear: Int, currentYear: Int): Int = calculateYears(birthYear, currentYear) * 12

fun calculateDays(birthYear: Int, currentYear: Int): Long =
    (((currentYear - birthYear) / 4) + ((currentYear - birthYear) * 365)).toLong()

fun calculateWeeks(birthYear: Int, currentYear: Int): Long = calculateDays(birthYear, currentYear) / 7

fun main() {
    TODO("Use essa função para rodar o codigo principal")
}