package oop_00000136177_KennyValentWinaldaSembiring.week07

fun main() {
        val weaponStarter = Weapon.forgeStarterSword()
        println(weaponStarter.item)
        println(weaponStarter.durability)

        val upgradedItem = weaponStarter.item.copy(damage = 25)

        processEvent(BattleState.SafeZone)
        processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
        processEvent(BattleState.LootDropped(upgradedItem))
        processEvent(BattleState.GameOver("Terkena jebakan racun"))
}


