package chap16_noinline_crossinline

inline fun <reified T> doSomething(obj: T, noinline func: (T) -> T) {
    func(obj)
}

fun main(args: Array<String>) {
    doSomething(String()) { it }
}