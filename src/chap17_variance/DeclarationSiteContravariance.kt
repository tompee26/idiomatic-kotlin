package chap17_variance

interface Consumer<in T> {
    fun consume(input: T): Boolean
}

class NumberConsumer : Consumer<Number> {
    override fun consume(input: Number): Boolean = true
}

fun checkConsumer(consumer: NumberConsumer) {
    val anyConsumer: Consumer<Int> = consumer
}

