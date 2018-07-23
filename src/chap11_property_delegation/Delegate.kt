package chap11_property_delegation

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class DelegateTest {
    val name: String by NameDelegate(Database())
}

class Database {
    fun queryName(): String = "Sample results"
}

class NameDelegate<T>(private val db: Database) : ReadOnlyProperty<T, String> {
    override fun getValue(thisRef: T, property: KProperty<*>): String = db.queryName()
}