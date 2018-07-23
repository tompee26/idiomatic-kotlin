package chap05_local_function

class LocalFunction {
    // Local function
    fun login(username: String, password: String): Boolean {
        var something = 1
        fun validateInput(input: String) {
            something++
            if (input.isEmpty()) {
                throw IllegalArgumentException("Must not be empty")
            }
        }
        validateInput(username)
        validateInput(password)
        return true
    }

    data class Credentials(val username: String, val password: String)

    // Local extension function
    fun Credentials.validate() {
        fun validateInput(input: String) {
            if (input.isEmpty()) {
                throw IllegalArgumentException("Must not be empty")
            }
        }
        validateInput(username)
        validateInput(password)
    }

    fun login(credentials: Credentials) {
        credentials.validate()
    }
}