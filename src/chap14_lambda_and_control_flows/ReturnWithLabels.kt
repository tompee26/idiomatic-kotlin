package chap14_lambda_and_control_flows

class ReturnWithLabels {
    data class Student(val name: String, val id: Int)

    private fun findSpock(list: List<Student>) {
        list.forEach label@{
            // or simply omit and use return@foreach instead
            if (it.name == "Spock") {
                println("Found Spock")
                return@label
            }
        }
        println("Did we find Spock?")
    }

    fun findStudentTest() {
        val studentList = listOf(Student("Kirk", 12345), Student("Spock", 54321))
        findSpock(studentList)
        println("End of findStudentTest")
    }
}

fun main(args: Array<String>) {
    val test = ReturnWithLabels()
    test.findStudentTest()
}