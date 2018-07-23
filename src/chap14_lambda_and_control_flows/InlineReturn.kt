package chap14_lambda_and_control_flows

class InlineReturn {
    data class Student(val name: String, val id: Int)

    private inline fun findSpock(list: List<Student>, func: (Student) -> Unit) {
        list.forEach { func(it) }
        println("Did we find Spock?")
    }

    fun findStudentTest() {
        val studentList = listOf(Student("Kirk", 12345), Student("Spock", 54321))
        findSpock(studentList) {
            if (it.name == "Spock") {
                println("Found Spock")
                return
            }
            println("Not Spock")
        }
        println("End of findStudentTest")
    }
}

fun main(args: Array<String>) {
    val test = InlineReturn()
    test.findStudentTest()
}