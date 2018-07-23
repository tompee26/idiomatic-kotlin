package chap01_extension_functions

class ExtensionFunction {
    fun String.second(): Char {
        if (isEmpty()) throw NoSuchElementException("Char sequence is empty.")
        if (length < 2) throw NoSuchElementException("Char sequence length is less than 2.")
        return this[1]
    }
}