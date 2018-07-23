package chap11_property_delegation

class LazyTest {
    data class Hero(val attribute: String, val attackType: String)

    val _hero: Hero by lazy { Hero("agility", "melee") }
}