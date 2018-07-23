package chap11_property_delegation

import kotlin.properties.Delegates

class ObservableTest {
    data class Hero(val attribute: String, val attackType: String)

    var hero: Hero by Delegates.observable(Hero("agility", "melee")) { prop, old, new ->
        /* Do something here */
    }
}