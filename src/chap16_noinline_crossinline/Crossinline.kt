package chap16_noinline_crossinline

fun someHigherOrderFunction(message: String, func: (String) -> Unit) {
}

inline fun crossInlineTest(message: String, crossinline func: (String) -> Unit) {
    someHigherOrderFunction("crossInlineTest") {
        func(it) // Compile error here
    }
}

fun main(arg: Array<String>) {
    someHigherOrderFunction("Hello") {
        println(it)
        // Uncomment to experience compile error
        //return // Compile error here because crossinline does not allow return
    }
    println("Main finished")
}
