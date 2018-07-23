package chap13_inline

class LambdaInstance {
    inline fun inlinedFilter(list: List<Int>, predicate: (Int) -> Boolean): List<Int> {
        return list.filter(predicate)
    }

    fun filterLessThanTwo(input: Int) = input < 2

    fun lambdaInstance(predicate: (Int) -> Boolean) {
        val list = listOf(1, 2, 3)
        val newList = inlinedFilter(list, predicate)
        println(newList)
    }

    fun lambdaInstanceTest() {
        lambdaInstance(::filterLessThanTwo)
    }
}