package oop_00000136177_KennyValentWinaldaSembiring.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon {
            val starterItem = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(starterItem, 50)
        }
        fun forgeEpicSword(): Weapon {
            val EpicItem = GameItem("Pedang Epic", 50, ItemRarity.EPIC)
            return Weapon(EpicItem, 100)
        }
    }
}