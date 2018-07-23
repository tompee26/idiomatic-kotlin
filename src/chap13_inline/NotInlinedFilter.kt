package chap13_inline

class NotInlinedFilter {
    fun notInlinedFilter(list: List<Int>, predicate: (Int) -> Boolean): List<Int> {
        return list.filter(predicate)
    }

    fun notInlinedTest() {
        val list = listOf(1, 2, 3)
        val newList = notInlinedFilter(list) { it < 2 }
        println(newList)
    }
}