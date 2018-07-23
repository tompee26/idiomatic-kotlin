package chap13_inline

class InlinedFunctionReference {
    inline fun inlinedFilter(list: List<Int>, predicate: (Int) -> Boolean): List<Int> {
        return list.filter(predicate)
    }

    fun filterLessThanTwo(input: Int) = input < 2

    fun functionReferenceTest() {
        val list = listOf(1, 2, 3)
        val newList = inlinedFilter(list, ::filterLessThanTwo)
        println(newList)
    }
}