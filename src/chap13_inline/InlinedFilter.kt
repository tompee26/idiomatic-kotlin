package chap13_inline

class InlinedFilter {
    inline fun inlinedFilter(list: List<Int>, predicate: (Int) -> Boolean): List<Int> {
        return list.filter(predicate)
    }

    fun lambdaInCallSiteTest() {
        val list = listOf(1, 2, 3)
        val newList = inlinedFilter(list) { it < 2 }
        println(newList)
    }
}