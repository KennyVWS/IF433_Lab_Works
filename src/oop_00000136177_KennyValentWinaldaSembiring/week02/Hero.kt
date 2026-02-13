package oop_00000136177_KennyValentWinaldaSembiring.week02

class Enemy (
    val NameMusuh: String,
    var HpEnemy: Int
)

class Hero (
    val Name: String,
    var Hp: Int = 100,
    var BaseDamage: Int
)
{
        fun attack(targetName: String) {
        println("${Name} menebas $targetName")
    }
    fun takeDamage(Damage: Int) {
        Hp = Hp - Damage

        if (Hp < 0) {
            Hp = 0
        }
    }

    fun isAlive(): Boolean {
        if (Hp > 0) {
            return true
        } else {
            return false
        }
    }

}