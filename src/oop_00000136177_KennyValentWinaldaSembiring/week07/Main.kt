package oop_00000136177_KennyValentWinaldaSembiring.week07

fun main() {
        GameManager.startGame()
        println(ItemRarity.LEGENDARY.dropChance)
        val weaponStarter = Weapon.forgeStarterSword()
        println(weaponStarter.item)
        println(weaponStarter.durability)
}


