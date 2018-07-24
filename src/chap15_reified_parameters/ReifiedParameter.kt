package chap15_reified_parameters

inline fun <reified T> doSomethingWithType(obj: T) {
    val typeName = T::class.java
    println(typeName)
}

fun main(args: Array<String>) {
    doSomethingWithType(String())
}