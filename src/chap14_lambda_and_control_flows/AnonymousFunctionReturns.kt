package chap14_lambda_and_control_flows

class AnonymousFunctionReturns {
    data class Student(val name: String, val id: Int)

    private fun findSpock(list: List<Student>) {
        list.forEach(fun(student) {
            if (student.name == "Spock") {
                println("Found Spock")
                return
            }
        })
        println("Did we find Spock?")
    }

    fun findStudentTest() {
        val studentList = listOf(Student("Kirk", 12345), Student("Spock", 54321))
        findSpock(studentList)
        println("End of findStudentTest")
    }
}

fun main(args: Array<String>) {
    val test = AnonymousFunctionReturns()
    test.findStudentTest()
}