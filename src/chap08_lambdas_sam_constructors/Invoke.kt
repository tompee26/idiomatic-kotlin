package chap08_lambdas_sam_constructors

fun main(args: Array<String>) {
    // Regular f(x)
    val addOffset = { x: Int -> x + 1 }
    println(addOffset(2))

    // Invoke
    println(addOffset.invoke(2))

    // Anonymous invocation
    println({ x: Int -> x + 1 }(2))
}
