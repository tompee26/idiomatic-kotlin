package chap10_elvis_operator

class SafeCall {
    data class Person(val name: String, val age: Int)

    fun safeCallTest() {
        val john: Person? = Person("John", 32)

        val age = john?.age
        // Uncomment to experience compile error
        //val offsetAge = age + 1 /* compile error */
    }

    fun elvisDefault() {
        val john: Person? = Person("John", 32)

        val age = john?.age ?: 25
        val offsetAge = age + 1 /* no compile error */
    }

    fun elvisThrow() {
        val john : Person? = Person("John", 32)

        val age = john?.age ?: throw IllegalArgumentException("John is null")
        val offsetAge = age + 1 /* no compile error */
    }
}