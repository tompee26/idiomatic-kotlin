package chap04_class_delegation

class DelegationSample {
    interface AttackType {
        fun getAttackType(): String
    }

    class Ranged : AttackType {
        override fun getAttackType(): String = "Ranged"
    }

    interface HeroType {
        fun getAttributeType(): String
    }

    class Strength : HeroType {
        override fun getAttributeType(): String = "Strength"
    }

    class Huskar : AttackType by Ranged(), HeroType by Strength()
}