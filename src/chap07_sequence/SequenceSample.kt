package chap07_sequence

// Copy of some stdlib functions. Use the actual function in stdlib for the latest code
class SequenceSample {
    public inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> {
        return filterTo(ArrayList<T>(), predicate)
    }

    public inline fun <T, C : MutableCollection<in T>> Iterable<T>.filterTo(destination: C, predicate: (T) -> Boolean): C {
        for (element in this) if (predicate(element)) destination.add(element)
        return destination
    }

    public fun <T> Sequence<T>.filter(predicate: (T) -> Boolean): Sequence<T> {
        return FilteringSequence(this, true, predicate)
    }

    internal class FilteringSequence<T>(
            private val sequence: Sequence<T>,
            private val sendWhen: Boolean = true,
            private val predicate: (T) -> Boolean
    ) : Sequence<T> {

        override fun iterator(): Iterator<T> = object : Iterator<T> {
            val iterator = sequence.iterator()
            var nextState: Int = -1 // -1 for unknown, 0 for done, 1 for continue
            var nextItem: T? = null

            private fun calcNext() {
                while (iterator.hasNext()) {
                    val item = iterator.next()
                    if (predicate(item) == sendWhen) {
                        nextItem = item
                        nextState = 1
                        return
                    }
                }
                nextState = 0
            }

            override fun next(): T {
                if (nextState == -1)
                    calcNext()
                if (nextState == 0)
                    throw NoSuchElementException()
                val result = nextItem
                nextItem = null
                nextState = -1
                @Suppress("UNCHECKED_CAST")
                return result as T
            }

            override fun hasNext(): Boolean {
                if (nextState == -1)
                    calcNext()
                return nextState == 1
            }
        }
    }
}