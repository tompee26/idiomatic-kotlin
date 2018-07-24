package chap15_reified_parameters

fun <T> isListOfString(arg: T): Boolean {
    // Uncomment to experience compile error
    //return arg is List<String> // Compile error
    return true
}

fun <T> isList(arg: T): Boolean {
    return arg is List<*>
}