package chap02_sealed_classes

class LegacyApproach {
    interface Class

    class Knight : Class

    class Priest : Class

    fun getClassString(clazz: Class): String {
        return when (clazz) {
            is Knight -> "Knight"
            is Priest -> "Priest"
            else -> throw IllegalArgumentException("Unknown class")
        }
    }
}
