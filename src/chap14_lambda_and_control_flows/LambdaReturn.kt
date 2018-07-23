package chap14_lambda_and_control_flows

class LambdaReturn {
    data class Student(val name: String, val id: Int)

    private fun findSpock(list: List<Student>) {
        list.forEach {
            if (it.name == "Spock") {
                println("Found Spock")
                return
            }
        }
        println("Spock not found")
    }

    fun findStudentTest() {
        val studentList = listOf(Student("Kirk", 12345), Student("Spock", 54321))
        findSpock(studentList)
        println("End of findStudentTest")
    }
}

fun main(args: Array<String>) {
    val test = LambdaReturn()
    test.findStudentTest()
}