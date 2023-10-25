fun multiplyLists(list1: List<Int>, list2: List<Int>, result: MutableList<Int>) {
    list1.forEachIndexed { index, it ->
        result.add(it * list2[index])
    }
}

fun main() {
    TODO("Use essa função para rodar o codigo principal")
}
