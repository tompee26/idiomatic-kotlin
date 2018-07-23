package chap01_extension_functions

class InheritanceAndPolymorphism {
    open class Base {
        open fun getString() = "Base"
    }

    fun Base.newString() = "BaseNewString"

    class Derived : Base() {
        override fun getString() = "Derived"
    }

    fun Derived.newString() = "DerivedNewString"
}
