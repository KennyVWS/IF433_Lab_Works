package oop_00000136177_KennyValentWinaldaSembiring.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            when {
                value < 0 -> {
                    println("Warning: damage cannot be negative."
                }
                value > 1000 -> {
                    println("Damage cannot be higher than 1000.")
                    field = 1000
                }
                    else -> {
                        field = value
                    }
            }
        }


    val tier: String
    get() = when (damage) {
        damage > 800 -> "Legendary Tier"
        damage> 500 -> "Epic Tier"
        else -> "Common"
    }
}

