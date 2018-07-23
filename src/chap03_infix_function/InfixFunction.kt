package chap03_infix_function

class InfixFunction {
    class Warrior(var hp: Int, var ap: Int) {
        infix fun attack(anotherWarrior: Warrior) {
            anotherWarrior.hp -= ap
        }
    }

    fun attackTest() {
        val warrior1 = Warrior(100, 20)
        val warrior2 = Warrior(100, 15)

        warrior1 attack warrior2
        println("Warrior 2 HP : ${warrior2.hp}")
    }
}