package chap10_elvis_operator

class ExpandedElvis {
    fun elvisSample(arg: String?) {
        val value = if (arg != null) arg else ""
    }
}