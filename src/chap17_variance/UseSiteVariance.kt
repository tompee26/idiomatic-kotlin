package chap17_variance

interface Group<T> {
    fun setGroup(value: T)
    fun getGroup(): T
}

fun doSomething(input1: Group<out Number>, input2: Group<in Number>) {
    //input1.setGroup(12) // compile error
    val outGroup: Number = input1.getGroup()

    input2.setGroup(12)
    //val inGroup: Number = input2.getGroup() // compile error
}