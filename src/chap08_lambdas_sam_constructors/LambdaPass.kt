package chap08_lambdas_sam_constructors

fun main(args: Array<String>) {
    fun addOffset(base: Int, lambda: (Int) -> Int): Int {
        return lambda.invoke(base)
    }

    fun addOffset(lambda: (Int) -> Int, base: Int): Int {
        return lambda.invoke(2)
    }

    // Last argument lambda
    addOffset(2) { x: Int -> x + 1 }

    // General syntax
    addOffset({ x: Int -> x + 1 }, 2)
}