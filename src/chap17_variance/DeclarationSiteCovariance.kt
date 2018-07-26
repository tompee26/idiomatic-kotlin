package chap17_variance

interface Producer<out T> {
    fun produce(): T
}

class NumberProducer : Producer<Number> {
    override fun produce(): Number = Math.random()
}

val producer: Producer<Any> = NumberProducer()
