package chap08_lambdas_sam_constructors

fun main(args: Array<String>) {
    // Assigning to a variable
    val runnable: Runnable = Runnable { print("I am a runnable") }

    // Returning a specific type of functional interface
    fun createOnClickListener(): View.OnClickListener {
        return View.OnClickListener { v -> print("I am clicked") }
    }
}